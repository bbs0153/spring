package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.BoardDAO;
import com.bit.vo.BoardVO;

@Controller
public class BoardController {

	private BoardDAO dao;

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}

	@RequestMapping("/listBoard.do")
	public ModelAndView listAll() {

		ModelAndView mav = new ModelAndView("listBoard");

		ArrayList<BoardVO> list = dao.listAll();

		mav.addObject("list", list);

		return mav;
	}

	@RequestMapping("/detailBoard.do")
	public ModelAndView detail(int no) {

		ModelAndView mav = new ModelAndView("detailBoard");

		BoardVO b = dao.getBoard(no);

		mav.addObject("b", b);

		return mav;
	}
}
