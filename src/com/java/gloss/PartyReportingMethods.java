package com.java.gloss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PartyReportingMethods {
	private SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml")
			.addAnnotatedClass(PartyDetails.class).buildSessionFactory();
	private Session session;

	public PartyDetails searchParty(int id) {
		session = factory.getCurrentSession();
		session.beginTransaction();

		PartyDetails party = session.get(PartyDetails.class, id);

		session.getTransaction().commit();

		return party;
	}

}
