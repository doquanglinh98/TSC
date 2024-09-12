package com.web.tsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {
	@GetMapping("/features")
	public String features() {
		return "views/features";
	}
}
