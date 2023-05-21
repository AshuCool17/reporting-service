/**
 * 
 */
package com.mycompany.reporting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gubli
 *
 */
@RestController
public class ReportingController {
	
	@GetMapping(value = "/reports")
	public String reports() {
		return null;
	}
	
	@GetMapping(value = "/search")
	public String search() {
		return null;
	}

}
