package org.ass.calculator.repository;

import java.util.List;

import org.ass.calculator.entity.Brand;
import org.ass.calculator.entity.Product;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RepositoryBrand {
	public void saveBrands(Brand brand) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(brand);
		transaction.commit();
	}
	public void saveProduct(Product product) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(product);
		transaction.commit();
	}
}
