package org.ass.calculator.repository;

import java.util.List;


import org.ass.calculator.entity.UserEntity;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserHqlRepository {
	public List<UserEntity> findAll() {
//		String hqlQuery="from UserEntity";
		StringBuilder builder = new StringBuilder();
		builder.append("from UserEntity");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		return query.getResultList();
	}
	public List<UserEntity> findByName(String name) {
		StringBuilder builder = new StringBuilder();
		builder.append("from UserEntity where name=:n");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setParameter("n", name);
		return query.getResultList();
	}
	public void updatePasswordByEmail(String password,String email){
		StringBuilder builder = new StringBuilder();
		builder.append("update UserEntity set password=:p where email=:e");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("p",password );
		query.setParameter("e",email);
		query.executeUpdate();
		transaction.commit();
	}
	public void deleteUserByName(String name) {
		StringBuilder builder = new StringBuilder();
		builder.append("delete from UserEntity where name=:n");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("n",name);
		query.executeUpdate();
		transaction.commit();
	}
	
//	pagination implementation 
//	partciular no of records 5 or 10 or how many u want
//	query.setFirstResult(no) will decide from where we start the selection record
//	query.setMaxResult(no) will decide the no of rows length
	public List<UserEntity> pagination(){
		StringBuilder builder = new StringBuilder();
		builder.append("from UserEntity");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setFirstResult(0);
		query.setMaxResults(2);
		return query.getResultList();
		
	}
	
	
}
