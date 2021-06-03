package cn.xiaoyu.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 程序启动类
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    /**
     * 程序入口
     */
    public static void main(String[] args) {
        SpringApplication.run(cn.xiaoyu.swagger.Application.class, args);
    }
}
