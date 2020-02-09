package com.java.gloss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstrumentReportingMethods {
	private SessionFactory factory = new Configuration().configure("/hibernate.cfg.xml")
			.addAnnotatedClass(InstrumentDetails.class).buildSessionFactory();
	private Session session;

	public InstrumentDetails searchInstrument(int ref) {
		session = factory.getCurrentSession();
		session.beginTransaction();

		InstrumentDetails instrument = session.get(InstrumentDetails.class, ref);

		session.getTransaction().commit();

		return instrument;
	}

}
