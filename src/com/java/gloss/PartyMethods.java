package com.java.gloss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PartyMethods {

	private SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(PartyDetails.class)
			.buildSessionFactory();
	private Session session;

	PartyMethods() {
	}


	public void addParty(String partyName, String partyRef, String country) {
		session=factory.getCurrentSession();
		
		session.beginTransaction();
		
		PartyDetails party = new PartyDetails(partyName, partyRef, country);

		session.save(party);

		session.getTransaction().commit();

	}

}
