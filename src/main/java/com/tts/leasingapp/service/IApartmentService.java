package com.tts.leasingapp.service;

import java.util.List;

import com.tts.leasingapp.dto.ApartmentDTO;

public interface IApartmentService {
	List<ApartmentDTO> getAvailableApartments();
}
