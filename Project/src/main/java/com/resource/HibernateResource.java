package com.resource;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class HibernateResource {
	
	static SessionFactory sf;
	// This code execute only once. 
	static {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf = con.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		try {
		return sf;
		}catch(Exception e) {
			System.err.println("Session Factory error "+e);
			return null;
		}
	}

}
