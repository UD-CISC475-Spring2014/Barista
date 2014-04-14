package org.hibernate.Vend;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Vend.DAL.Contact_DAL;
import org.hibernate.Vend.DAL.Vendor_DAL;
import org.hibernate.Vend.util.HibernateUtil;

//Testing Purposes. This is really nothing but to testing shit

public class VendorManagement {
	
	public static void main(String arg[]){
		
		Vendor_DAL vendal = new Vendor_DAL();
		Contact_DAL condal = new Contact_DAL();
		
		Vendor vendor = vendal.Select("f795d2a9-245f-4f69-be44-5c6b6f79b0c3").get(0);
		Contact contact = condal.Select("5a41b01e-7f59-4dd2-a6c4-4cad882bc0ab").get(0);
		
		VendContact vencon = new VendContact();
		
		vencon.setContact(contact);
		vencon.setVendor(vendor);
		vencon.setPrimaryContact(true);
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				
		session.getSessionFactory().close();
	}

}
