package com.gl.JavaCaseStudy17102022.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.JavaCaseStudy17102022.bean.Bill;
import com.gl.JavaCaseStudy17102022.bean.Offer;
import com.gl.JavaCaseStudy17102022.service.RechargeService;

import antlr.collections.List;

@RestController
public class RechargeController {
	
	@Autowired
	private RechargeService service;
	
	@GetMapping(value="/welcomePage")
	 public ModelAndView showWelcomePage() {
		ModelAndView mv = new ModelAndView("WelcomePage");
		java.util.List<Offer> offerList = service.findAllOffers();
		mv.addObject("offerList",offerList);
		return mv;
	}
	
	@GetMapping("/performRecharge")
	public ModelAndView saveNewBill(@RequestParam("mobileNumber") String n,@RequestParam("offerId") long offerId) {
		long id = service.generateId();
		Bill bill = new Bill();
		bill.setMobileNumber(n);
		bill.setOfferId(offerId);
		bill.setTransactionId(offerId);
		service.billSave(bill);
		Offer offer = service.findAOffer(offerId);
		ModelAndView mv = new ModelAndView("billPage");
		mv.addObject("offer",offer);
		mv.addObject("bill",bill);
		return mv;
	}
}