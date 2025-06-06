package cba.ifmt.util;

import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory sessionFactory;
	
	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.out.println("Erro na criação da sessionFactory: " + ex.getMessage());
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
