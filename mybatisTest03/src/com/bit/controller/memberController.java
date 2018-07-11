package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.memberDAO;
import com.bit.vo.MemberVO;

@Controller
public class memberController {

	private memberDAO dao;

	public void setDao(memberDAO dao) {
		this.dao = dao;
	}

	@RequestMapping("/listMember.do")
	public ModelAndView listAll() {

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.listAll());
		return mav;

	}

	@RequestMapping(value = "/insertMember.do", method = RequestMethod.GET)
	public void insertForm() {

	}

	@RequestMapping(value = "/insertMember.do", method = RequestMethod.POST)
	public ModelAndView insertSubmit(MemberVO m) {

		ModelAndView mav = new ModelAndView("redirect:/listMember.do");
		int re = dao.insert(m);

		if (re < 1) {
			mav.addObject("msg", "등록에 실패했습니다");
			mav.setViewName("error");
		}
		return mav;
	}

	@RequestMapping("/detailMember.do")
	public ModelAndView detail(String id) {

		ModelAndView mav = new ModelAndView();
		mav.addObject("m", dao.getMember(id));

		return mav;

	}

	@RequestMapping(value = "/updateMember.do", method = RequestMethod.GET)
	public ModelAndView updateForm(String id) {

		ModelAndView mav = new ModelAndView();
		mav.addObject("m", dao.getMember(id));

		return mav;

	}

	@RequestMapping(value = "/updateMember.do", method = RequestMethod.POST)
	public ModelAndView updateSubmit(MemberVO m) {

		ModelAndView mav = new ModelAndView("redirect:/listMember.do");
		int re = dao.update(m);

		if (re < 1) {
			mav.addObject("msg", "수정에 실패했습니다");
			mav.setViewName("error");
		}
		return mav;
	}

	@RequestMapping("/deletMember.do")
	public ModelAndView delete(String id) {

		ModelAndView mav = new ModelAndView("redirect:/listMember.do");
		int re = dao.delete(id);

		if (re < 1) {
			mav.addObject("msg", "수정에 실패했습니다");
			mav.setViewName("error");
		}
		return mav;

	}

}
