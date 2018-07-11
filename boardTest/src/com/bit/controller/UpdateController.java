package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BoardDAO;
import com.bit.vo.BoardVO;

@Controller
@RequestMapping("/updateBoard.do")
public class UpdateController {

	private BoardDAO dao;

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView form(int no) {
		ModelAndView mav = new ModelAndView();
		BoardVO b = dao.getBoard(no);
		mav.addObject("b", b);
		return mav;

	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(BoardVO b) {
		ModelAndView mav = new ModelAndView();
		int re = dao.updateBoard(b);

		if (re > 0) {
			mav.setViewName("redirect:/listBoard.do");
		} else {
			mav.addObject("msg", "수정에 실패하였습니다");
			mav.setViewName("error");
		}

		return mav;

	}

}
