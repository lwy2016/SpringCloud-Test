package com.lwy94.zuultest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author liweiya
 * @date 2019/8/20 11:30
 */

@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
//		pre：路由之前
//		routing：路由之时
//		post： 路由之后
//		error：发送错误调用
        return "pre";
    }

    /**
     * 过滤的顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，true为永远过滤。
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println("-----"+request.getMethod() + "--------"+request.getRequestURI());
        Object username =  request.getParameter("username");

        if (username != null && "lwy2016".equals(username)) {
            ctx.setSendZuulResponse(false);
            try {
                ctx.getResponse().setContentType("text/html;charset=utf-8");
                ctx.getResponse().getWriter().write("监控到用户名是lwy2016");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
