package com.tts.leasingapp.dto;

import com.tts.leasingapp.domain.Apartment;

public class ApartmentDTO {
	private int apartNumber;
	private float sizeInSqFoot;
	private int numBedrooms;
	private boolean availability;
	private float baseRent;
	private long communityId;
	private String communityName;
	
	public ApartmentDTO() {
	}
	
	public ApartmentDTO(Apartment apartment) {
		this.apartNumber = apartment.getApartNumber();
		this.sizeInSqFoot = apartment.getSizeInSqFoot();
		this.numBedrooms = apartment.getNumBedrooms();
		this.availability = apartment.isAvailable();
		this.baseRent = apartment.getBaseRent();
		this.communityId = apartment.getCommunity().getId();
		this.communityName = apartment.getCommunity().getName();
	}

	public int getApartNumber() {
		return apartNumber;
	}

	public void setApartNumber(int apartNumber) {
		this.apartNumber = apartNumber;
	}

	public float getSizeInSqFoot() {
		return sizeInSqFoot;
	}

	public void setSizeInSqFoot(float sizeInSqFoot) {
		this.sizeInSqFoot = sizeInSqFoot;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public float getBaseRent() {
		return baseRent;
	}

	public void setBaseRent(float baseRent) {
		this.baseRent = baseRent;
	}

	public long getCommunityId() {
		return communityId;
	}

	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
}
