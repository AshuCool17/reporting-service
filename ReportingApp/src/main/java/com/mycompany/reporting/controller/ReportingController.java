/**
 * 
 */
package com.mycompany.reporting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.reporting.service.ReportingService;

/**
 * @author Ashutosh
 *
 */
@RestController
public class ReportingController {
	
	@Autowired
	ReportingService reportingService;
	
	@GetMapping(value = "/reports")
	public String reports() {
		
		return "Reports";
	}
	
	@GetMapping(value = "/search")
	public String search() {
		return "Search";
	}

}
