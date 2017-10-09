package com.supply.print;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@MapperScan("com.supply.print.model")
@SpringBootApplication
public class PrintApplication{
	private Logger logger = LoggerFactory.getLogger(PrintApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PrintApplication.class, args);
	}
	
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("服务启动完成!");
//    }
}
