package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ModelAndView list() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("list", dao.listAll());

		return mav;

	}

	@RequestMapping(value = "/insertDept.do", method = RequestMethod.GET)
	public void insertForm() {

	}

	@RequestMapping(value = "/insertDept.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(DeptVO d) {

		ModelAndView mav = new ModelAndView("redirect:/listDept.do");
		int re = dao.insert(d);

		if (re != 1) {
			mav.addObject("msg", "등록에 실패하였습니다.");
			mav.setViewName("error");
		}
		return mav;
	}

	@RequestMapping("/detailDept.do")
	public ModelAndView detail(int dno) {

		ModelAndView mav = new ModelAndView();

		DeptVO d = dao.getDept(dno);

		mav.addObject("d", d);

		return mav;

	}

	@RequestMapping(value = "/updateDept.do", method = RequestMethod.GET)
	public ModelAndView updateForm(int dno) {
		DeptVO d = new DeptVO();
		d = dao.getDept(dno);

		ModelAndView mav = new ModelAndView();

		mav.addObject("d", d);

		return mav;

	}

	@RequestMapping(value = "/updateDept.do", method = RequestMethod.POST)
	public ModelAndView updateSubmit(DeptVO d) {

		ModelAndView mav = new ModelAndView("redirect:/listDept.do");

		int re = dao.update(d);

		if (re != 1) {
			mav.addObject("msg", "수정에 실패하였습니다");
			mav.setViewName("error");
		}

		return mav;
	}

	@RequestMapping("/deleteDept.do")
	public ModelAndView delete(int dno) {

		ModelAndView mav = new ModelAndView("redirect:/listDept.do");

		int re = dao.delete(dno);
		if (re != 1) {
			mav.addObject("msg", "수정에 실패하였습니다");
			mav.setViewName("error");
		}
		return mav;

	}

}
