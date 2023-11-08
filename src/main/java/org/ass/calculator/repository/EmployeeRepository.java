package org.ass.calculator.repository;

import org.ass.calculator.entity.Brand;
import org.ass.calculator.entity.Emp;
import org.ass.calculator.entity.Product;
import org.ass.calculator.entity.Project;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeRepository {
	
	public void saveEmp(Emp emp) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(emp);
		transaction.commit();
	}
	public void saveProduct(Project p) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(p);
		transaction.commit();
	}
	
}
