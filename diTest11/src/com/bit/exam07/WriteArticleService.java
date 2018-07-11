package com.bit.exam07;

public class WriteArticleService {

	private ArticleDao dao;

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}

	public void service() {
		System.out.println("서비스입니다.");
		dao.insert();
	}

}
