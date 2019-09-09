package com.tts.leasingapp.service;

import com.tts.leasingapp.domain.Community;

public interface ICommunityService {
	
	Community saveCommunity(Community community);

	Iterable<Community> getAllCommunities();

}
