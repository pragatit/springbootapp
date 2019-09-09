package com.tts.leasingapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Community {
	
	@Id
	private Long id;
	private String community;
	private float rentForAPet;//rent_for_a_pet
	private String address;
	private boolean petsAllowed;
	private boolean hasPlayGround;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public float getRentForAPet() {
		return rentForAPet;
	}

	public void setRentForAPet(float rentForAPet) {
		this.rentForAPet = rentForAPet;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isPetsAllowed() {
		return petsAllowed;
	}

	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}

	public boolean isHasPlayGround() {
		return hasPlayGround;
	}

	public void setHasPlayGround(boolean hasPlayGround) {
		this.hasPlayGround = hasPlayGround;
	}

}
