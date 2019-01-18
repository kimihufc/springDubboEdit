package com.hjl.web.config;

import com.hjl.web.util.Trace;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author: HJL
 * @create: 2019-01-18 11:36
 */
@Component
public class TraceIntercepter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UUID uuid =  UUID.randomUUID();
        Trace.setTrace(uuid.toString());
        return true;
    }
}
