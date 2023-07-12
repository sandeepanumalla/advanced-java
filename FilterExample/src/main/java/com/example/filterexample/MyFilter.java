package com.example.filterexample;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Before filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("After filter");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
