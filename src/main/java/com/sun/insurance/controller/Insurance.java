package com.sun.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.insurance.dto.InsuranceDetail;
import com.sun.insurance.service.InsuranceService;

@RestController
@RequestMapping("/insurance")
public class Insurance {
	
	@Autowired
	private InsuranceService insuranceService;
	
	@GetMapping
	public InsuranceDetail getInsurance(@PathVariable int id) {
			
		return insuranceService.getMappedInsurance(id);
	}

}
