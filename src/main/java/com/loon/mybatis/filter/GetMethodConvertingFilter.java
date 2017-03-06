package com.loon.mybatis.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * User:李辉
 * date:2017-02-08 17:06
 */
public class GetMethodConvertingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(wrapper((HttpServletRequest) servletRequest),servletResponse);
    }

    @Override
    public void destroy() {

    }
    private HttpServletRequestWrapper wrapper(HttpServletRequest request){
        return new HttpServletRequestWrapper(request){
            public String getMethod(){
                return "POST";
            }
        };
    }
    private HttpServletResponseWrapper responseWrapper(HttpServletResponse response){
        return new HttpServletResponseWrapper(response){
            public String getMethod(){
                return "POST";
            }
        };
    }
}
