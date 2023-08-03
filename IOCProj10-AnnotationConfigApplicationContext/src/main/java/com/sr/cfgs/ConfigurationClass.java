package com.sr.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com/sr/sbeans"})
public class ConfigurationClass {

	@Bean("localdt")
	public LocalDateTime getTime() {
		return LocalDateTime.now();
	}
}
