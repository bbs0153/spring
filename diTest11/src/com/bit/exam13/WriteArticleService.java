package com.bit.exam13;

public class WriteArticleService {

	private ArticleDao dao;

	public WriteArticleService(ArticleDao dao) {
		super();
		this.dao = dao;
	}

	public void service() {
		System.out.println("서비스입니다.");
		dao.insert();
	}

}
