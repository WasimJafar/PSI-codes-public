package com.sapient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sapient.filters.ErrorFilter;
import com.sapient.filters.PostFilter;
import com.sapient.filters.PreFilter;
import com.sapient.filters.RouteFilter;

@SpringBootApplication(scanBasePackages = {"com.sapient"})
@EnableZuulProxy
@RefreshScope
@Configuration
@EnableEurekaClient
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	
	public PreFilter preFilter() {
		return new PreFilter();
	}

//	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
//	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

//	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	

}
