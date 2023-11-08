package org.ass.calculator.repository;

import java.util.List;

import org.ass.calculator.entity.Answer;
import org.ass.calculator.entity.Question;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class QuestionRepository {
	
	public void saveOrUpdate(Question question) {
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(question);
		transaction.commit();
	}
	public Question findById(int id) {
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		return session.get(Question.class,id);
	}
	public void update(int id,String ques,List<Answer> answer) {
		Question question=findById(id);
		
		question.setQuestion(ques);
		question.setAnswers(answer);
		saveOrUpdate(question);
	}
	public void delete(int id) {
		Question question=findById(id);
		SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(question);
		transaction.commit();
	}
}
