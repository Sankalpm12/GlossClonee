package com.java.gloss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TradeReportingMethods {
	private SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(TradeDetails.class)
			.buildSessionFactory();
	private Session session;
	
	public TradeDetails searchTrade(int tradeRef) {
		session=factory.getCurrentSession();
		session.beginTransaction();
		
		TradeDetails trade=session.get(TradeDetails.class, tradeRef);
		
		session.getTransaction().commit();
		
		return trade;
	}
}
