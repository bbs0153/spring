package com.bit.exam03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	public SmsSender sender() {

		SmsSender sender = new SmsSender();

		sender.setFrom("성인");
		sender.setTo("연주");

		return sender;
	}
	
	@Bean
	public SystemMonitor monitor() {

		SystemMonitor monitor = new SystemMonitor();

		monitor.setPeroidTime(1);
		monitor.setSender(sender());

		return monitor;
	}
}
