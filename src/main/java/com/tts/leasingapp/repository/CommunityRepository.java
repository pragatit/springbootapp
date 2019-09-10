package com.tts.leasingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tts.leasingapp.domain.Community;

@Repository
public interface CommunityRepository extends CrudRepository<Community, Long> {

	@Query("From Community c where c.petsAllowed = :petsAllowed")
	//select * from community c where c.pets_allowed = 1/0
	List<Community> findByPetsAllowed(@Param("petsAllowed") boolean petsAllowed);

}
