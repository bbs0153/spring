package com.bit.exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MemberConfig.class, BoardConfig.class})
public class PersonConfig {

	@Bean
	public Person p() {
		return new Person("º∫¿Œ", 20);
	}
}
