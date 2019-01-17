package com.hjl.order;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author: HJL
 * @create: 2019-01-17 19:20
 */
@SpringBootApplication
public class OrderStart {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrderStart.class)
            .web(WebApplicationType.NONE)
            .build()
            .run(args);

    }
}
