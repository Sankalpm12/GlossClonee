package com.java.gloss;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trade_details")
public class TradeDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="trade_no")
	private int id;
	
	@Column(name="company")
	private String company;
	
	@Column(name="instrument")
	private String instrument;
	
	@Column(name="party")
	private String party;
	
	@Column(name="price")
	private int price;
	
	@Column(name="market")
	private String market;
	
	@Column(name="quantity")
	private int quantity;
	
	
	public TradeDetails() {
	}
	public TradeDetails(String company, String instrument, String party, int price, String market, int quantity) {
		this.company = company;
		this.instrument = instrument;
		this.party = party;
		this.price = price;
		this.market = market;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "TradeDetails [company=" + company + ", instrument=" + instrument + ", party=" + party + ", price="
				+ price + ", market=" + market + ", quantity=" + quantity + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}	
	
}
