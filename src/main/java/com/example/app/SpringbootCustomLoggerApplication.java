package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.log.SleuthSlf4jProperties;
import org.springframework.cloud.sleuth.log.SpanLogger;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import com.example.app.logger.CustomSpanLogger;

@SpringBootApplication
public class SpringbootCustomLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCustomLoggerApplication.class, args);
	}
	
	@Bean
	@Primary
	public SpanLogger customSpanLogger(SleuthSlf4jProperties properties) {
		return new CustomSpanLogger(properties.getNameSkipPattern());
	}
	
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public Sampler defaultSampler() {
		return new AlwaysSampler();
	}
}
