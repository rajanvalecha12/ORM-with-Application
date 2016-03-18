package com.training.apps;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.*;

import com.training.entity.InPatient;
import com.training.entity.Patient;
import com.training.utils.HiberUtils;
public class InheritanceApplication {

	public static void main(String[] args) {
		SessionFactory factory=HiberUtils.getFactory();
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		Timestamp date=new Timestamp(new Date().getTime());
		/*InPatient patient=new InPatient(77,"Gaurav",45,23,date);
		session.save(patient);*/
		tx.commit();
		System.out.println("One Patient Added");
		Patient patient2 = (Patient) session.get(Patient.class, 77);
		System.out.println(patient2);
		session.close();
		System.out.println("who is it: " +patient2.fee());
	}

}
