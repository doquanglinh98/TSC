package com.web.tsc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TscController {

	// heath check
	@GetMapping("/info")
	ResponseEntity<String> inf() {
		return new ResponseEntity<>("App is running!", HttpStatus.OK);
	}

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "World");
		return "views/index";
	}

}
