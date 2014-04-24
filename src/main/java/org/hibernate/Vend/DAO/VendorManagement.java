package org.hibernate.Vend.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Vend.CRUD.Contact_CRUD;
import org.hibernate.Vend.CRUD.Vendor_CRUD;
import org.hibernate.Vend.util.HibernateUtil;

//Testing Purposes. This is really nothing but to testing shit

public class VendorManagement {
	
	public static void main(String arg[]){
		
		Vendor_CRUD vendal = new Vendor_CRUD();
		Contact_CRUD condal = new Contact_CRUD();
		
		Vendor vendor = vendal.Select("f795d2a9-245f-4f69-be44-5c6b6f79b0c3").get(0);
		Contact contact = condal.Select("5a41b01e-7f59-4dd2-a6c4-4cad882bc0ab").get(0);
		
		HibernateUtil.getSessionFactory().close();
		
	}

}
