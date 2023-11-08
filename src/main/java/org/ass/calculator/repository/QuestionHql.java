package org.ass.calculator.repository;

import java.util.List;

import org.ass.calculator.entity.Question;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class QuestionHql {
	
	public List<Question> findAll(){
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Question");
		List<Question> list = query.getResultList();
		return list;
	}
	public List<Object[]> innerQuery(){
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select q.questionId,q.question,a.answer from Question as q inner join q.answers as a");
		return query.getResultList();
	}
	
}
