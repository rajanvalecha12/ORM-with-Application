package com.training.apps;
import org.hibernate.*;

import com.training.domains.Address;
import com.training.entity.Doctor;
import com.training.utils.HiberUtils;
public class FirstApplication {
	public static void main(String[] args) {
		 
		SessionFactory factory=HiberUtils.getFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Doctor doc=new Doctor(106,"Suresh",9988446567L);
		Address resiAddr = new Address("Sarita vihar","nehru nagar","New Delhi","122015");
		Address hospAddr = new Address("Anand vihar","nehru Palace","Vasant kunj","102015");
		doc.setHospitalAddress(hospAddr);
		doc.setResiAddress(resiAddr);
		session.save(doc);
		/*Integer key=(Integer)session.save(doc);//returns the primary key
		System.out.println(key);
		Doctor doc2 = (Doctor)session.get(Doctor.class, 101);*/
		System.out.println(doc);
		tx.commit();
		factory.close();
		
		
		
	}

}
