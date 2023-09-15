package org.tongji.programming;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class StudentServiceProvider {
    public static void main(String[] args) {
        SpringApplication.run(StudentServiceProvider.class, args);
    }
}
