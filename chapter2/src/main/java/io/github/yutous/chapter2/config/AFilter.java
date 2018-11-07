package io.github.yutous.chapter2.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器
 * @author yutou
 * @date 2018/11/7
 * @since 1.0.0
 */
@WebFilter(filterName = "aFilter",urlPatterns = {"/*"})
@Slf4j
public class AFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("{} 初始化",getClass());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("{} doFilter 请求处理",getClass());
        //对request、response进行一些预处理
        // 比如设置请求编码
        // request.setCharacterEncoding("UTF-8");
        // response.setCharacterEncoding("UTF-8");
        //TODO 进行业务逻辑

        //链路 直接传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        log.info("{} 销毁",getClass());
    }
}
