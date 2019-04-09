package com.example.demo;
/**
 * 
 * @author 李兆杰
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
@EnableSwagger2
@SpringBootApplication
public class UcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcDemoApplication.class, args);
	}
	@Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .paths(regex("/uc.*")).build();

    }

}
