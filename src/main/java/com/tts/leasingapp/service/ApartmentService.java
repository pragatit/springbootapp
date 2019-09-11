package com.tts.leasingapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.leasingapp.domain.Apartment;
import com.tts.leasingapp.dto.ApartmentDTO;
import com.tts.leasingapp.repository.ApartmentRepository;

@Service
public class ApartmentService implements IApartmentService{
	
	@Autowired
	private ApartmentRepository apartmentRepository;

	@Override
	public List<ApartmentDTO> getAvailableApartments() {
		List<ApartmentDTO> resultList = new ArrayList<ApartmentDTO>();
		List<Apartment> availableApartments = apartmentRepository.getAvailableApartments(true);
		for (Apartment apartment : availableApartments) {
			resultList.add(new ApartmentDTO(apartment));
		}
		return resultList;
	}

}
