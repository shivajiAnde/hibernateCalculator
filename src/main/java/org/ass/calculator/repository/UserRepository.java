package org.ass.calculator.repository;

import java.io.Serializable;

import org.ass.calculator.dto.UserDto;
import org.ass.calculator.entity.UserEntity;
//import org.ass.calculator.util.ConnectionProperiesUtil;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;

public class UserRepository implements Serializable {
	
	 public void saveOrUpdate(UserEntity userEntity) {
			/*
			 * Configuration cfg = new Configuration();
			 * cfg.setProperties(ConnectionProperiesUtil.getMysqlDbProperties());
			 * cfg.addAnnotatedClass(UserEntity.class);
			 */
			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.merge(userEntity);
			transaction.commit();
			
	}
	 public UserEntity findById(int id) {
			/*
			 * Configuration cfg = new Configuration();
			 * cfg.setProperties(ConnectionProperiesUtil.getMysqlDbProperties());
			 * cfg.addAnnotatedClass(UserEntity.class);
			 */
		 SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		 Session session=sessionFactory.openSession();
		 return session.get(UserEntity.class,id);
	 }
	public void update(UserDto userDto) {
		UserEntity userEntity=findById(userDto.getAltkey());
		if(userEntity!=null) {
			userEntity.setName(userDto.getName());
			userEntity.setCity(userDto.getCity());
			userEntity.setCountry(userDto.getCountry());
			userEntity.setPincode(userDto.getPincode());
			saveOrUpdate(userEntity);
			
			
			/*
			 * Configuration cfg=new Configuration();
			 * cfg.setProperties(ConnectionProperiesUtil.getMysqlDbProperties());
			 * cfg.addAnnotatedClass(UserEntity.class); SessionFactory
			 * sessionFactory=cfg.buildSessionFactory(); Session
			 * session=sessionFactory.openSession(); Transaction transaction =
			 * session.beginTransaction(); session.merge(userEntity); transaction.commit();
			 */
		}
		
	}
	public void delete(UserDto userDto) {
		UserEntity userEntity=findById(userDto.getAltkey());
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(userEntity);
		transaction.commit();
	}


}
