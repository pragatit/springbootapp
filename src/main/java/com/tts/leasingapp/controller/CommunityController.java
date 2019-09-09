package com.tts.leasingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.leasingapp.domain.Community;
import com.tts.leasingapp.service.ICommunityService;

@RestController
@RequestMapping("/api/community")
public class CommunityController {
	
	@Autowired
	private ICommunityService communityService;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
	@PostMapping("/")
	public Community saveCommunity(@RequestBody Community community) {
		return communityService.saveCommunity(community);
	}
	
	@GetMapping("/")
	public Iterable<Community> getAllCommunities() {
		return communityService.getAllCommunities();
	}

}
