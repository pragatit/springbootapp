package com.tts.leasingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.leasingapp.domain.Community;
import com.tts.leasingapp.service.ICommunityService;

@Controller
public class CommunityController {
	
	@Autowired
	private ICommunityService communityService;

	@GetMapping("/home")
	public String home(Community community) {
		return "/community/save_community_details";
	}
	
	@PostMapping("/community")
	public String saveDetails(Community community, Model model) {
		Community saveCommunity = communityService.saveCommunity(community);
		model.addAttribute("community", saveCommunity);
		return "/community/community_details";
	}
	
}
