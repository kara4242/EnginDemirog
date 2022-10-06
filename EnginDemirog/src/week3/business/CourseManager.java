package week3.business;

import java.util.Iterator;

import week3.core.logging.Logger;
import week3.dataAccess.CourseDao;
import week3.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] logger;
	
	
	public void add(Course course) throws Exception
	{
		Course[] courses=new Course[] {
				new Course("engin", "java", "javakursu", 500),
				new Course("engina", "bilisim", "bilisimkursu1",600),
		};
		for (Course c :courses)
		{
			if(c.getKategori()==course.getKategori())
			{
				throw new Exception("aynı isimde kurs girilemez");
			}
			
			if(c.getKursismi()==course.getKursismi())
			{
				throw new Exception("Kurs ismi aynı olamaz");
			}
		
			
		}
		if(course.getKursfiyatı()<0)
		{
			
			throw new Exception("Kurs fiyatı 0 dan kücük olamaz");
		}
	courseDao.add(course);
		for(Logger log:logger)
		{
			log.log("Mesaj atıldı");
		}
		
	}

	public CourseManager(CourseDao courseDao, Logger[] logger) {
		super();
		this.courseDao = courseDao;
		this.logger = logger;
	}

}
