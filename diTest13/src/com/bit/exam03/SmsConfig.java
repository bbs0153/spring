package com.bit.exam03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmsConfig {
	
	@Bean
	public SmsSender sender() {

		SmsSender s = new SmsSender();
		s.setFrom("성인");
		s.setTo("연주");

		return s;
	}
}
