package com.sun.insurance.service;

import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.sun.insurance.dto.InsuranceDetail;

@Service
public class InsuranceService {
	
	public InsuranceDetail getMappedInsurance(int id){
		return getQuote().get(id);
	}

	private Map<Integer, InsuranceDetail> getQuote() {
		Map<Integer, InsuranceDetail> mapInsurance = new HashMap<>();
		
		mapInsurance.put(1, new InsuranceDetail(1, "test1","100"));
		mapInsurance.put(2, new InsuranceDetail(1, "test2","200"));
		mapInsurance.put(3, new InsuranceDetail(1, "test3","300"));
		mapInsurance.put(4, new InsuranceDetail(1, "test4","400"));
		return mapInsurance;
	}

}
