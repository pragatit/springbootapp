package com.tts.leasingapp.service;

import java.util.List;

import com.tts.leasingapp.domain.Community;

public interface ICommunityService {
	
	Community saveCommunity(Community community);

	Iterable<Community> getAllCommunities();

	Community getCommunity(Long valueOf);

	boolean deleteCommunity(Long valueOf);

	List<Community> filter(boolean petsAllowed);

}
