package com.me.sample.spring.beans;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MySampleController {
	@GetMapping("/")
	@ResponseBody
	public String handle(Model model) {
		return "sample1:Hello World!";
	}
}
