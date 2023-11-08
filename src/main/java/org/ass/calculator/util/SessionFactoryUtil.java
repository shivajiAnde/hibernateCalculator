package org.ass.calculator.util;

import org.ass.calculator.entity.AirHosters;
import org.ass.calculator.entity.Answer;
import org.ass.calculator.entity.Brand;
import org.ass.calculator.entity.Captain;
import org.ass.calculator.entity.City;
import org.ass.calculator.entity.Emp;
import org.ass.calculator.entity.Flight;
import org.ass.calculator.entity.Product;
import org.ass.calculator.entity.Project;
import org.ass.calculator.entity.Question;
import org.ass.calculator.entity.Student;
import org.ass.calculator.entity.Team;
import org.ass.calculator.entity.UserEntity;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	
	private static SessionFactory sessionFactory = null;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) 
		{			
			 Configuration cfg = new Configuration();
			 cfg.setProperties(ConnectionProperiesUtil.getMysqlDbProperties());
			 cfg.addAnnotatedClass(UserEntity.class);
			 cfg.addAnnotatedClass(Team.class);
			 cfg.addAnnotatedClass(Captain.class);
			 cfg.addAnnotatedClass(Flight.class);
			 cfg.addAnnotatedClass(AirHosters.class);
			 cfg.addAnnotatedClass(AirHosters.class);
			 cfg.addAnnotatedClass(Product.class);
			 cfg.addAnnotatedClass(Brand.class);
			 cfg.addAnnotatedClass(Question.class);
			 cfg.addAnnotatedClass(Answer.class);
			 cfg.addAnnotatedClass(Project.class);
			 cfg.addAnnotatedClass(Emp.class);
			 cfg.addAnnotatedClass(Student.class);
			 cfg.addAnnotatedClass(City.class);
			 
			 
			  sessionFactory=cfg.buildSessionFactory();
		}
		return sessionFactory;
	}
	
}
