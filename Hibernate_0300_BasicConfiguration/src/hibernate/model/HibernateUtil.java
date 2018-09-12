package hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static final Session session = getSession();
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		}catch (Exception e) {
			System.err.println("Initial Session Factory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	private static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
	
	
	

}
