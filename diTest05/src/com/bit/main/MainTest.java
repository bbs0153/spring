package com.bit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bit.dao.MemberDao;
import com.hanbit.dao.BoardDao;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fnames = { "com/bit/main/beansBoard.xml", "com/bit/main/beansMember.xml" };
		ApplicationContext context = new ClassPathXmlApplicationContext(fnames);
		MemberDao mDao = (MemberDao) context.getBean("mDao");
		BoardDao bDao = (BoardDao) context.getBean("bDao");
		
		mDao.insert();
		bDao.insert();
		
	}

}
