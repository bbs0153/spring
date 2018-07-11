package com.bit.exam05;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {
	
	@Bean(autowire=Autowire.BY_NAME)
	public SystemMonitor sm() {
		
		SystemMonitor s = new SystemMonitor();
		s.setPeroidTime(10);
		return s;
	}
}
