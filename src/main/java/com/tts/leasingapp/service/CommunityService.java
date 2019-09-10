package com.tts.leasingapp.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Community getCommunity(Long id) {
		Optional<Community> optional = communityRepository.findById(id);
		return optional.orElse(null);
	}

	@Override
	public boolean deleteCommunity(Long id) {
		communityRepository.deleteById(id);
		return true;
	}

	@Override
	public List<Community> filter(boolean petsAllowed) {
		return communityRepository.findByPetsAllowed(petsAllowed);
	}
	
}
