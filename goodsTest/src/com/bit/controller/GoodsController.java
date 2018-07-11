package com.bit.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;

@Controller
public class GoodsController {

	private GoodsDAO dao;

	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}

	@RequestMapping("/listGoods.do")
	public ModelAndView listAll() {

		ModelAndView mav = new ModelAndView();
		ArrayList<GoodsVO> list = dao.listAll();

		mav.addObject("list", list);
		mav.setViewName("listGoods");

		return mav;
	}

	@RequestMapping("/detailGoods.do")
	public ModelAndView detail(@RequestParam("no") int no) {

		ModelAndView mav = new ModelAndView("detailGoods");
		GoodsVO g = dao.getGoods(no);
		mav.addObject("g", g);
		return mav;

	}

	@RequestMapping("/deleteGoods.do")
	public ModelAndView delete(@RequestParam("no") int no) {

		ModelAndView mav = new ModelAndView("deleteGoods");

		int re = dao.deleteGoods(no);

		if (re > 0) {
			mav.setViewName("redirect:/listGoods.do");
		} else {
			mav.addObject("msg", "상품삭제에 실패하였습니다");
			mav.setViewName("error");
		}
		return mav;
	}
}
