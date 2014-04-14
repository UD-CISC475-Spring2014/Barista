package org.hibernate.Vend.DAL;

import org.hibernate.Session;
import org.hibernate.Query;

import java.util.List;
import java.util.ArrayList;

import org.hibernate.Vend.Contact;
import org.hibernate.Vend.util.HibernateUtil;

public class Contact_DAL {
	public String Insert(Contact contact){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Contact input = new Contact();
		input.setContactFirstName(contact.getContactFirstName());
		input.setContactMiddleName(contact.getContactMiddleName());
		input.setContactLastName(contact.getContactLastName());
		input.setActiveFlg(contact.getActiveFlg());
		
		session.save(input);
		session.getTransaction().commit();
		
		return input.getContactId();
	}
	
	public List<Contact> Select(String ContactId){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		List<Contact> list = new ArrayList<Contact>();
		
		Query query = session.createQuery("FROM Contact WHERE ContactId= :cid").setParameter("cid", ContactId);
		
		list = query.list();

		session.getTransaction().commit();
		
		return list;
	}
	
	public void Update(Contact contact){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Contact find = (Contact) session.get(Contact.class, contact.getContactId());
		
		if(find != null){
			Query query= session.createQuery("UPDATE Contact SET contactfirstname= :cfn, contactmiddlename= :cmn, "
					+ "contactlastname= :cln, activeflg = :fl " + 
					"WHERE ContactId= :id")
					.setParameter("cfn", contact.getContactFirstName())
					.setParameter("cmn", contact.getContactMiddleName())
					.setParameter("cln", contact.getContactLastName())
					.setParameter("fl", contact.getActiveFlg())
					.setParameter("id", contact.getContactId());
			
			query.executeUpdate();
		}
		
		session.getTransaction().commit();
	}
	
	public void Delete(Contact contact){
		contact.setActiveFlg(false); // you are only setting the ActiveFlg false.
		Update(contact);
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		session.beginTransaction();
//		
//		Query query = session.createQuery("DELETE FROM Contact WHERE ContactId= :id")
//				.setParameter("id", contact.getContactId());
//		
//		query.executeUpdate();
//		
//		session.getTransaction().commit();
		
	}
}
