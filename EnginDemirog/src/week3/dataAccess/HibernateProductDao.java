package week3.dataAccess;

import week3.entities.Course;

public class HibernateProductDao implements CourseDao {

	public void add(Course course) {
		System.out.println("hipernate ile veritabanına eklendi");
		
	}

}
