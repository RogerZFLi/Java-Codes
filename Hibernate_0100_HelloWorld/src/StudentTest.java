import org.hibernate.Session;

import hibernate.model.HibernateUtil;
import hibernate.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(3);
		s.setName("s3");
		s.setAge(33);
		
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		session.delete(s);
		session.getTransaction().commit();
		session.close();
		//HibernateUtil.getSessionFactory().close();
	}
}
