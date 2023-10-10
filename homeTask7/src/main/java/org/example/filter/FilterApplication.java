package org.example.filter;

import com.mysql.cj.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterApplication implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        if (req.getMethod().equals("POST")) {
            if (StringUtils.isNullOrEmpty(req.getParameter("name"))
                    && StringUtils.isNullOrEmpty(req.getParameter("date"))
                    && StringUtils.isNullOrEmpty(req.getParameter("description"))) {
                resp.sendRedirect("/add");
            } else {
                filterChain.doFilter(req, resp);
            }
        }
        filterChain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
    }
}
