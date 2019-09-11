package com.tts.leasingapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tts.leasingapp.domain.Apartment;

@Repository
public interface ApartmentRepository extends CrudRepository<Apartment, Integer>{
	
	@Query("From Apartment where availability = :avalaibility")
	List<Apartment> getAvailableApartments(@Param("avalaibility") boolean avalaibility);

}
