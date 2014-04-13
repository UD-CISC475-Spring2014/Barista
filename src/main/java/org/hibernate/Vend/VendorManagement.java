package org.hibernate.Vend;

import org.hibernate.Session;
import org.hibernate.Vend.util.HibernateUtil;

public class VendorManagement {
	
	public static void main(String arg[]){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.getSessionFactory().close();
	}

}
