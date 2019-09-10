package com.tts.leasingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommunityController {

	@GetMapping("/community")
	public String getDetails() {
		return "/community/community_details";
	}
	
	@GetMapping("/community1")
	public ModelAndView community1() {
		ModelAndView mav = new ModelAndView("/community/community_details");
		return mav;
	}

}
