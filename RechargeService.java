package com.gl.JavaCaseStudy17102022.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.JavaCaseStudy17102022.Repository.BillRepository;
import com.gl.JavaCaseStudy17102022.Repository.OfferRepository;
import com.gl.JavaCaseStudy17102022.bean.Bill;
import com.gl.JavaCaseStudy17102022.bean.Offer;



@Service
public class RechargeService {
	
	@Autowired
	private OfferRepository repositoryA;
	@Autowired
	private BillRepository repositoryB;
	

	public Long generateId() {
		Long val = repositoryB.findMaxBillId();
		if(val==null)
			val=100001L;
		else
			val=val+1;
		return val;
	}

	public List<Offer> findAllOffers() {
		List<Offer> offerList = repositoryA.findAll();
		return offerList;
	}

	public Offer findAOffer(Long id) {
		Offer offer = repositoryA.getById(id);
		return  offer;
	}
	
	public void billSave(Bill bill) {
		repositoryB.save(bill);
	}
}