package org.ass.calculator.repository;

import org.ass.calculator.entity.Flight;
import org.ass.calculator.entity.Student;
import org.ass.calculator.entity.Team;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AssociationRepository {
	public void saveTeamDetails(Team team) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(team);
		transaction.commit();
	}
	public void saveStudentDetails(Student student) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(student);
		transaction.commit();
	}
	
	
	public void saveFlightDetails(Flight flight) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(flight);
		transaction.commit();
	}
	public Team findById(int id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		return session.get(Team.class,id);
	}
	public void delete(int id) {
		Team team=findById(id);
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(team);
		transaction.commit();
	}
}
