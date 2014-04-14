package org.hibernate.Vend;

public class VendorProjContact implements java.io.Serializable{

	private Vendor Vendor;
	private Project Project;
	private Contact Contact;
	private boolean PrimaryContact;
	
	public VendorProjContact(){}

	public Vendor getVendor() {
		return Vendor;
	}

	public void setVendor(Vendor vendor) {
		Vendor = vendor;
	}

	public Project getProject() {
		return Project;
	}

	public void setProject(Project project) {
		Project = project;
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
