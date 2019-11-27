package org.kreativekraken.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskController {

	@GetMapping("/list")
	public String greeting(Model model, HttpServletRequest request) {
		return "list";
	}
}
