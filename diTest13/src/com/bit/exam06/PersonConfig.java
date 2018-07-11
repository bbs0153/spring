package com.bit.exam06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {

	@Bean
	@Scope(value = "prototype")
	public Person p() {

		Person p = new Person();

		p.setAge(26);
		p.setName("º∫¿Œ");

		return p;
	}

}
