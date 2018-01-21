package com.bqj.microservicesimpleconsumermovie.microservicesimpleconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MicroserviceSimpleConsumerMovieApplication {
	/**
	 * 添加 @LoadBalanced 用于执行ribbon负载均衡使用
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleConsumerMovieApplication.class, args);
	}
}
