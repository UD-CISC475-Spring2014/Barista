package org.hibernate.Vend.DAO;

public class ProjectEventContact implements java.io.Serializable {

	private ProjectEvent ProjectEvent;
	private Contact Contact;
	private boolean PrimaryContact;
	
	public ProjectEventContact(){}

	public ProjectEvent getProjectEvent() {
		return ProjectEvent;
	}

	public void setProjectEvent(ProjectEvent projectEvent) {
		ProjectEvent = projectEvent;
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
	};
	
	
	
}
