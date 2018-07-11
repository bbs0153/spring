package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;


@Controller
@RequestMapping("/updateGoods.do")
public class UpdateGoodsController {

	private GoodsDAO dao;

	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView form(int no) {
		ModelAndView mav = new ModelAndView();
		GoodsVO g = dao.getGoods(no);
		mav.addObject("g", g);
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(GoodsVO g) {

		ModelAndView mav = new ModelAndView();

		int re = dao.updateGoods(g);

		if (re > 0) {
			mav.setViewName("redirect:/listGoods.do");
		} else {
			mav.addObject("msg", "상품 수정에 실패했습니다.");
			mav.setViewName("error");
		}

		return mav;
	}
}
