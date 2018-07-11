package com.bit.exam02;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	public WriteArticleService ws() {
		return new WriteArticleService();
	}
	

}
