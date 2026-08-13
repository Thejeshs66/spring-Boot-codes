package com.example.adhar;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adharController {

	private adharService adharService ;

	public adharController(com.example.adhar.adharService adharService) {
		super();
		this.adharService = adharService;
	}
	
	@GetMapping("/adhar")
	
	public List<adhar> getAdharDetails(){
		
		List<adhar> list = adharService.findAllAdharDetials();
		return list;
	}
	
}
