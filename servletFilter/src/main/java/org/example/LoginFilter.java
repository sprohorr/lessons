package org.example;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        if (req.getMethod().equals("POST")) {
            String userAuthorized = "user";
            if (userAuthorized.equals(req.getParameter("login"))) {
                filterChain.doFilter(req, res);
            } else {
                res.sendRedirect("/hello");
            }
        }
        filterChain.doFilter(req, res);
    }

    @Override
    public void destroy() {
    }
}
