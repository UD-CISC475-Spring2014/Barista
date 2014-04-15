package org.hibernate.Vend.CRUD;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Vend.Vendor;
import org.hibernate.Vend.util.HibernateUtil;

public class Vendor_CRUD {
	
	public String Insert(Vendor vendor){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Vendor input = new Vendor();
		
		input.setVendorName(vendor.getVendorName());
		input.setActiveFlg(vendor.isActiveFlg());
		
		session.save(input);
		session.getTransaction().commit();
		
		return input.getVendorID();		
	}
	
	public List<Vendor> Select(String Id){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from Vendor where VendorID = :id").setParameter("id", Id);
		
		List<Vendor> list = query.list();
		
		session.getTransaction().commit();
		return list;
	}
	
	public void Update(Vendor vendor){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Vendor find = (Vendor) session.get(Vendor.class, vendor.getVendorID());
		
		if(find != null){
			Query query= session.createQuery("UPDATE Vendor SET vendorname= :vn, activeflg = :fl " + 
					"WHERE VendorId= :id")
					.setParameter("vn", vendor.getVendorName())
					.setParameter("fl", vendor.isActiveFlg())
					.setParameter("id", vendor.getVendorID());
			query.executeUpdate();
		}
		
		session.getTransaction().commit();
	}
	
	public void Delete(Vendor vendor){
		vendor.setActiveFlg(false);
		Update(vendor);
	}

}
