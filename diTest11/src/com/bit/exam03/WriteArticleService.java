package com.bit.exam03;

public class WriteArticleService {

	private ArticleDao dao;

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}

	public void service() {
		System.out.println("�����Դϴ�.");
		dao.insert();
	}

}
