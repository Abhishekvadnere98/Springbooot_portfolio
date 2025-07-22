package com.springboot_portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "/", " ", "/home" })
	public String showHomepage(Model model) {
		model.addAttribute("title","Home");
		return "master";
	}

	@GetMapping({ "/projects" })
	public String showProjectpage(Model model) {
		model.addAttribute("title","Projects");
		return "master";
	}

	@GetMapping({ "/resume" })
	public String showResumepage(Model model) {
		model.addAttribute("title","Resume");
		return "master";
	}

	@GetMapping({ "/contact" })
	public String showContactpage(Model model) {
		model.addAttribute("title","Contact");
		return "master";
	}

}
