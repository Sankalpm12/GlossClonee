package com.java.gloss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TradeMethods {
	
	private SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(TradeDetails.class)
			.buildSessionFactory();
	private Session session;
	
	TradeMethods(){}
	
	public TradeMethods(SessionFactory factory2) {
		factory=factory2;
	}

	public void addTradeDetails(String company,String instrument,String party,int price ,String market,int quantity) {
		session=factory.getCurrentSession();
		session.beginTransaction();
		TradeDetails td=new TradeDetails(company, instrument, party, price, market, quantity);
		session.save(td);
		session.getTransaction().commit();
		
	}
	
	
}
