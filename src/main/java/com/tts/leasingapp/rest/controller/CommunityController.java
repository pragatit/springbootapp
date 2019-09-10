package com.tts.leasingapp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tts.leasingapp.domain.Community;
import com.tts.leasingapp.service.ICommunityService;

@RestController("communityRestController")
@RequestMapping("/restapi/community")
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

	@GetMapping("/{id}")
	public Community getCommunity(@PathVariable("id") String id) {
		return communityService.getCommunity(Long.valueOf(id));
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteCommunity(@PathVariable("id") String id) {
		return communityService.deleteCommunity(Long.valueOf(id));
	}
	
	@GetMapping("/filter")
	public List<Community> getFileteredCommunities(@RequestParam boolean petsAllowed){
		List<Community> communities = communityService.filter(petsAllowed);
		return communities;
	}

}
