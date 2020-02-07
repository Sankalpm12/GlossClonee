package com.java.gloss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstrumentMethods {

	private SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(InstrumentDetails.class)
			.buildSessionFactory();
	private Session session;

	InstrumentMethods() {
	}

	public InstrumentMethods(SessionFactory factory2) {
		factory = factory2;
	}

	public void addInstrument(String instrName, String instrReference, String market) {
		session=factory.getCurrentSession();
		
		session.beginTransaction();
		
		InstrumentDetails instr = new InstrumentDetails(instrName, instrReference, market);

		session.save(instr);

		session.getTransaction().commit();

	}

}
