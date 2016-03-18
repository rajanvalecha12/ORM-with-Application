package com.training.apps;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.domains.Address;
import com.training.entity.ClinincalAssistant;
import com.training.entity.Doctor;
import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;

public class One2Many {

	public static void main(String[] args) {
		SessionFactory factory = new HiberUtils().getFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		Doctor doc=new Doctor(1100,"Tarun",8872234132L);
		Address resiAddr = new Address("Baldev nagar", "Chawri bnazaar", "Rajouri Garden", "122015");
		Address hospAddr = new Address("Anand vihar", "nehru Palace", "Vasant kunj", "102015");
		doc.setHospitalAddress(hospAddr);
		doc.setResiAddress(resiAddr);
		ClinincalAssistant assistant = new ClinincalAssistant(10556, "Rajan Khurana");
		doc.setAssistant(assistant);
		Timestamp date=new Timestamp(new Date().getTime());
		InPatient patient1=new InPatient(78,"dhawal",45,23,date);
		InPatient patient2=new InPatient(79,"chawal",45,23,date);
		InPatient patient3=new InPatient(70,"mawal",45,23,date);
		Set<Patient> list=new HashSet<Patient>();
		
		list.add(patient1);
		list.add(patient2);
		list.add(patient3);
		doc.setPatientList(list);
		session.save(doc);
		
		System.out.println(doc);
		tx.commit();
		factory.close();
		

	}

}
