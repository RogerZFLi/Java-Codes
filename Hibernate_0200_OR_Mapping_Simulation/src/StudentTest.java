


import java.sql.SQLException;

import hibernate.model.Student;

public class StudentTest {
	public static void main(String[] args) throws Exception {
		Student s = new Student();
		s.setId(3);
		s.setName("s3");
		s.setAge(33);
		
		Session session = new Session();
		
		session.save(s);
	}
}
