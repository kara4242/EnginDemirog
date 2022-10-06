package week3.dataAccess;

import week3.entities.Course;

public class JdbcProductDao implements CourseDao {
	public void add(Course course) {
		System.out.println("jdbc ile veritabanına eklendi");
		
	}

}
