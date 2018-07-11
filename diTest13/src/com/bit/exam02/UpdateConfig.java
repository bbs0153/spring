package com.bit.exam02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateConfig {

	@Bean
	public UpdateInfo info() {
		UpdateInfo u = new UpdateInfo();
		u.setMemberId("tiger");
		return u;
	}
}
