package com.bit.exam03;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SmsConfig.class)
public class SystemConfig {
	
	@Bean(autowire=Autowire.BY_TYPE, initMethod="monitor")
	public SystemMonitor monitor() {
		
		SystemMonitor monitor = new SystemMonitor();
	
		monitor.setPeroidTime(1);

		return monitor;	
	}
}
