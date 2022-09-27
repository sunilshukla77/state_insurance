package com.sun.insurance.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sun.insurance.dto.InsuracnceDetails;
import com.sun.insurance.dto.InsuranceDetail;
import com.sun.insurance.service.InsuranceService;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

	@Autowired
	private InsuranceService insuranceService;

	@GetMapping
	public InsuranceDetail getInsurance(@RequestParam(value = "id") int id) {
		
		return insuranceService.getMappedInsurance(id);
			
	}
	
	@PostMapping
	public String createNewInsurancePolicy(InsuracnceDetails insuraceDetails) {
		return "";
	}
	
	
}
