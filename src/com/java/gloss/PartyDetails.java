package com.java.gloss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "party_details")
public class PartyDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "party_id")
	private int partyId;

	@Column(name = "party_name")
	private String partyName;

	@Column(name = "party_reference")
	private String partyReference;

	@Column(name = "country")
	private String country;

	@Override
	public String toString() {
		return "PartyDetails [partyId=" + partyId + ", partyName=" + partyName + ", instrumentReference="
				+ partyReference + ", country=" + country + "]";
	}

	
	public PartyDetails() {
	}


	public PartyDetails(String partyName, String instrumentReference, String country) {
		this.partyName = partyName;
		this.partyReference = instrumentReference;
		this.country = country;
	}

	public int getPartyId() {
		return partyId;
	}

	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPartyReference() {
		return partyReference;
	}

	public void setPartyReference(String instrumentReference) {
		this.partyReference = instrumentReference;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
