package com.zby.spring.kg.controller;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


/**
 * 控制器
 * @author zby
 *
 */
@Controller
public class MainController {

	@GetMapping("/")
	public String root(){
		return "redirect:/index";
	}
	
	@GetMapping("/index")
	public String index(){
		return "index";
	}
	
}























