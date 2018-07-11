package com.bit.exam04;

import org.springframework.beans.factory.annotation.Autowire;
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
	
	@Bean(autowire=Autowire.BY_NAME)
	public SystemMonitor monitor() {

		SystemMonitor monitor = new SystemMonitor();

		monitor.setPeroidTime(10);
		
		return monitor;
	}
}
