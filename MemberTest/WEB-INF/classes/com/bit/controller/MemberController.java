package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.MemberDAO;
import com.bit.vo.MemberVO;

@Controller
public class MemberController {

	private MemberDAO dao;

	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@RequestMapping("/listMember.do")
	public ModelAndView listAll() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("list", dao.listAll());
		mav.setViewName("listMember");

		return mav;

	}

}
