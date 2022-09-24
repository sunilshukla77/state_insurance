package com.sun.insurance.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sun.insurance.dto.InsuranceDetail;
import com.sun.insurance.exception.NotFoundInsuranceException;

@Service
public class InsuranceService {
	
	public InsuranceDetail getMappedInsurance(int id){
		if(id>4){
			throw new NotFoundInsuranceException(HttpStatus.NOT_FOUND, "Insurance does not exist");
		}
		return getQuote().get(id);
	}

	private Map<Integer, InsuranceDetail> getQuote() {
		Map<Integer, InsuranceDetail> mapInsurance = new HashMap<>();
		
		mapInsurance.put(1, new InsuranceDetail(1, "test1","100"));
		mapInsurance.put(2, new InsuranceDetail(2, "test2","200"));
		mapInsurance.put(3, new InsuranceDetail(3, "test3","300"));
		mapInsurance.put(4, new InsuranceDetail(4, "test4","400"));
		return mapInsurance;
	}

}
