package week3;

import week3.business.CourseManager;
import week3.core.logging.DatabaseLogger;
import week3.core.logging.FileLogger;
import week3.core.logging.Logger;
import week3.dataAccess.HibernateProductDao;
import week3.entities.Course;

public class Main {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Course course=new Course("engin", "java", "kukla", 50);
		Logger[] log= {new DatabaseLogger(),new FileLogger()};
		CourseManager cm=new CourseManager(new HibernateProductDao(), log);
		cm.add(course);

	}

}
