package org.hibernate.Vend;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Vend.DAL.Vendor_DAL;
import org.hibernate.Vend.util.HibernateUtil;

public class VendorManagement {
	
	public static void main(String arg[]){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		Vendor_DAL vendal = new Vendor_DAL();
		
		Vendor vendor = new Vendor();
		
		vendor.setActiveFlg(true);
		vendor.setVendorName("DUKE MAGICAL PARK");
	
		String id = vendal.Insert(vendor);
		
		System.out.println("Insert Successful! VendorID: " + id);
		
		vendor = vendal.Select(id).get(0);
		
		System.out.println(vendor.getVendorID() + ' ' + vendor.getVendorName() + ' ' + vendor.isActiveFlg());
		
		vendor.setVendorName("Duke Wizard Park");
		
		vendal.Update(vendor);
		
		vendor = vendal.Select(id).get(0);
		
		System.out.println(vendor.getVendorID() + ' ' + vendor.getVendorName() + ' ' + vendor.isActiveFlg());
		
		vendal.Delete(vendor);
		
		vendor = vendal.Select(id).get(0);
		
		System.out.println(vendor.getVendorID() + ' ' + vendor.getVendorName() + ' ' + vendor.isActiveFlg());
		
		session.getSessionFactory().close();
	}

}
