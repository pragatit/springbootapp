package com.tts.leasingapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.leasingapp.domain.Community;

@Repository
public interface CommunityRepository extends CrudRepository<Community, Long> {

}
