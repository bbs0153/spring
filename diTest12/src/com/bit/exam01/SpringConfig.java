package com.bit.exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bit.exam02.ArticleDao;
import com.bit.exam02.WriteArticleService;

@Configuration
public class SpringConfig {
	
	@Bean
	public ArticleDao dao(){
			return new ArticleDao();
	}
	
	@Bean
	public WriteArticleService ws(){
		
		WriteArticleService ob = new WriteArticleService();
		ob.setDao(dao());
		return ob;
		
	}


}
