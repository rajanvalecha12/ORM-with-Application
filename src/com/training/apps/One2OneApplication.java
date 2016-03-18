package com.training.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.ClinincalAssistant;
import com.training.entity.Doctor;
import com.training.utils.HiberUtils;

public class One2OneApplication {
	public static void main(String[] args) {
		SessionFactory factory = HiberUtils.getFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Doctor doc = new Doctor(1600, "Gyanesh", 9954346567L);
		Address resiAddr = new Address("Uttam vihar", "Chawri nagar", "New Delhi", "122015");
		Address hospAddr = new Address("Anand vihar", "nehru Palace", "Vasant kunj", "102015");
		doc.setHospitalAddress(hospAddr);
		doc.setResiAddress(resiAddr);
		ClinincalAssistant assistant = new ClinincalAssistant(1037556, "Rajeev Khurana");
		doc.setAssistant(assistant);
		session.save(doc);
		/*
		 * Integer key=(Integer)session.save(doc);//returns the primary key
		 * System.out.println(key); Doctor doc2 =
		 * (Doctor)session.get(Doctor.class, 101);
		 */
		System.out.println(doc);
		tx.commit();
		factory.close();

	}
}
