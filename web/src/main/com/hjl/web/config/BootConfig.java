package com.hjl.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: HJL
 * @create: 2019-01-18 11:37
 */
@Configuration
public class BootConfig implements WebMvcConfigurer {

    @Autowired
    private TraceIntercepter traceIntercepter;


    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(traceIntercepter).addPathPatterns("/**");
    }
}
