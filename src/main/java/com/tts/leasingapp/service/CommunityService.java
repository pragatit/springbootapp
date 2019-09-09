package com.tts.leasingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.leasingapp.domain.Community;
import com.tts.leasingapp.repository.CommunityRepository;

@Service
public class CommunityService implements ICommunityService {
	
	@Autowired
	private CommunityRepository communityRepository;

	@Override
	public Community saveCommunity(Community community) {
		return communityRepository.save(community);
	}

	@Override
	public Iterable<Community> getAllCommunities() {
		return communityRepository.findAll();
	}

}
