package org.hibernate.Vend.CRUD;

import org.hibernate.Session;
import org.hibernate.Vend.VendContact;
import org.hibernate.Vend.util.HibernateUtil;

public class VendContact_CRUD {
	public void insert(VendContact vendcontact){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		
		
		session.getTransaction().commit();
	}
}
