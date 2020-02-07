package com.java.gloss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instrument_details")
public class InstrumentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instrumentId;

	@Column(name = "instrument_name")
	private String instrumentName;

	@Column(name = "instrument_reference")
	private String instrumentReference;

	@Column(name = "market")
	private String market;

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	public String getInstrumentReference() {
		return instrumentReference;
	}

	public void setInstrumentReference(String instrumentReference) {
		this.instrumentReference = instrumentReference;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public InstrumentDetails(String instrumentName, String instrumentReference, String market) {
		this.instrumentName = instrumentName;
		this.instrumentReference = instrumentReference;
		this.market = market;
	}

	@Override
	public String toString() {
		return "InstrumentDetails [instrumentName=" + instrumentName + ", instrumentReference=" + instrumentReference
				+ ", market=" + market + "]";
	}

}
