package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.DeptDAO;
import com.bit.vo.DeptVO;

@Controller
public class DeptController {
	
	private DeptDAO dao;
	
	

	public void setDao(DeptDAO dao) {
		this.dao = dao;
	}



	@RequestMapping("/listDept.do")
	public ModelAndView listAll() {

		ModelAndView mav = new ModelAndView();
		ArrayList<DeptVO> list = dao.listAll();
		
		mav.addObject("list", list);
		mav.setViewName("listDept");

		return mav;

	}
}
