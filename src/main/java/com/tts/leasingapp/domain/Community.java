package com.tts.leasingapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Community {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String name;
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

	public String getName() {
		return name;
	}

	public void setName(String community) {
		this.name = community;
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

	@Override
	public String toString() {
		return "Community [id=" + id + ", community=" + name + ", rentForAPet=" + rentForAPet + ", address="
				+ address + ", petsAllowed=" + petsAllowed + ", hasPlayGround=" + hasPlayGround + "]";
	}

}
