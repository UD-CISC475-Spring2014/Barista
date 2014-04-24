package org.hibernate.Vend.DAO;

public class VendContact implements java.io.Serializable {
	private Vendor Vendor;
	private Contact Contact;
	private boolean PrimaryContact;
	
	public VendContact(){}

	public Vendor getVendor() {
		return Vendor;
	}

	public void setVendor(Vendor vendor) {
		Vendor = vendor;
	}

	public Contact getContact() {
		return Contact;
	}

	public void setContact(Contact contact) {
		Contact = contact;
	}

	public boolean isPrimaryContact() {
		return PrimaryContact;
	}

	public void setPrimaryContact(boolean primaryContact) {
		PrimaryContact = primaryContact;
	}
	
	
}
