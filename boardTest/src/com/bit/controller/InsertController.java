package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BoardDAO;
import com.bit.vo.BoardVO;

@Controller
@RequestMapping("/insertBoard.do")
public class InsertController {

	private BoardDAO dao;

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public void form() {

	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(BoardVO b) {

		ModelAndView mav = new ModelAndView();

		int re = dao.insertBoard(b);

		if (re > 0) {
			mav.setViewName("redirect:/listBoard.do");
		} else {

			mav.addObject("msg", "등록에 실패하였습니다");
			mav.setViewName("error");
		}
		return mav;
	}
}
