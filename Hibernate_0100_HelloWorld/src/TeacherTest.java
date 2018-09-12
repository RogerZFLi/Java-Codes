import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import hibernate.model.HibernateUtil;
import hibernate.model.Teacher;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setId(2);
		t.setName("t2");
		t.setTitle("Chief2");
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		session.delete(t);
		session.getTransaction().commit();
		
		session.close();
		
		
	}
}
