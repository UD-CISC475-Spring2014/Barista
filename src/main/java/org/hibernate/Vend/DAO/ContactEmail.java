package org.hibernate.Vend.DAO;

public class ContactEmail implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Contact Contact;
	private VendEmail VendEmail;
	private boolean PrimaryEmail;
	
	public ContactEmail(){}

	public Contact getContact() {
		return Contact;
	}

	public void setContact(Contact contact) {
		Contact = contact;
	}

	public VendEmail getVendEmail() {
		return VendEmail;
	}

	public void setVendEmail(VendEmail vendEmail) {
		VendEmail = vendEmail;
	}

	public boolean isPrimaryEmail() {
		return PrimaryEmail;
	}

	public void setPrimaryEmail(boolean primaryEmail) {
		PrimaryEmail = primaryEmail;
	};
	
	
}