package com.training.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.print.Doc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.Doctor;
import com.training.ifaces.MyDAO;
import com.training.utils.HiberUtils;

public class DoctorDAO implements MyDAO<Doctor>{

	SessionFactory factory;
	
	public DoctorDAO() {
		super();

		factory = HiberUtils.getFactory();
	}

	@Override
	public Object add(Doctor t) {

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		Integer key = (Integer)session.save(t);

		tx.commit();
		session.close();
		return key;
	}

	@Override
	public Doctor find(Object obj) {

		SessionFactory factory = HiberUtils.getFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Doctor doc2 = (Doctor) session.get(Doctor.class, (Serializable) obj);
		
		tx.commit();
		session.close();

		return doc2;
	}

	@Override
	public List<Doctor> findAll() {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		List<Doctor> docList = session.createQuery("from Doctor").list();
		tx.commit();
		session.close();
		
		return docList;
	}

	@Override
	public boolean update(Object obj) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		boolean result= true;
		try{
			session.update(obj);
		}catch(Exception e){
			result = false;
		}
		tx.commit();
		session.close();
		
		return result;
	}

	@Override
	public boolean delete(Serializable obj) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Doctor doc=find(obj);
		boolean result = true;
		
		try{
			session.delete(doc);
		}catch(Exception e) {
		
			result = false;
		}
		
		return false;
	}

	@PreDestroy
	public void destroy() {
		factory.close();
	}

	
}
