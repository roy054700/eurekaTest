package com.example.roy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class AccessZuulFilter extends ZuulFilter {
   // private static Logger log = LoggerFactory.getLogger(AccessZuulFilter.class);
    @Override
    public String filterType() {
        return "pre";// 前置过滤器
    }

    @Override
    public int filterOrder() {
        return 0; // 优先级为0，数字越大，优先级越低
    }

    @Override
    public boolean shouldFilter() {
        return false;// 是否执行该过滤器，此处为true，说明需要过滤
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("进入拦截器=============");
        RequestContext  ctx =  RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(String.format("%s AccessUserNameFilter request to %s", request.getMethod(), request.getRequestURL().toString()));

        String token = request.getParameter("accessToken");
        if(token == null){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            ctx.setResponseBody("无权限访问");
            return ctx;
        }
        return null;
    }
}
