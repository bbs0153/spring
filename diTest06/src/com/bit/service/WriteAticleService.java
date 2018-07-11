package com.bit.service;

import com.bit.dao.ArticleDao;

public class WriteAticleService {
	private ArticleDao dao;

	public WriteAticleService(ArticleDao dao) {
		super();
		this.dao = dao;
	}
	
	public void service() {
		dao.insert();
	}
}
