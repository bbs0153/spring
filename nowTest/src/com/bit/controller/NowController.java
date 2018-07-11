package com.bit.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NowController {

	@RequestMapping("/now.do")
	public ModelAndView now() {
		
		Date date = new Date();
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int day = date.getDate();
		int hours = date.getHours();
		int minutes = date.getMinutes();
		int seconds = date.getSeconds();
		
		String str = year+"년 "+month+"월 "+day+"일 "+hours+"시간 "+minutes+"분 "+seconds+"초입니다 ";
	
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", str);
		mav.setViewName("now");
		return mav;
		
	}
}
