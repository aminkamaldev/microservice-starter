package com.akamal.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import({ springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class })
public class SpringFoxConfig {

	private ApiInfo getApiInfo() {
		return new ApiInfo("MicroServiceStarter",
				"This application is for put all important module tu build a good microservice", "1.0",
				"Terms of service", new Contact("Amin KAMAL", "my.site.com", "amin.kamal.dev@gmail.com"), "MIT", "",
				Collections.emptyList());
	}

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.ant("/v1/api/**")).build().apiInfo(getApiInfo())
				.tags(new Tag("Employee Entity", "Repository for Employee entities"));
	}
}