package com.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bit.dao.GoodsDAO;
import com.bit.vo.GoodsVO;

@Controller
@RequestMapping("/insertGoods.do")
public class InsertGoodsController {

	private GoodsDAO dao;

	public void setDao(GoodsDAO dao) {
		this.dao = dao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public void form() {

	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submit(GoodsVO g) {

		ModelAndView mav = new ModelAndView();

		int re = dao.insertGoods(g);

		if (re > 0) {
			mav.setViewName("redirect:/listGoods.do");
		} else {
			mav.addObject("msg", "상품등록에 실패하였습니다");
			mav.setViewName("error");
		}
		return mav;
	}

}
