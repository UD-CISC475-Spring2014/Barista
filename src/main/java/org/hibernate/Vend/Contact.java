package org.hibernate.Vend;

import java.util.Set;
import java.util.HashSet;

public class Contact {
	private String ContactId;

	private String ContactFirstName;
	private String ContactMiddleName;
	private String ContactLastName;
	
	private boolean ActiveFlg;
	
	private Set<ProjectEventContact> ProjectEventContacts = new HashSet<ProjectEventContact>();
	private Set<ContactEmail> ContactEmails = new HashSet<ContactEmail>();
	private Set<VendContact> VendContacts = new HashSet<VendContact>();
	
	public Contact(){}

	public String getContactId() {
		return ContactId;
	}

	public void setContactId(String contactId) {
		ContactId = contactId;
	}

	public String getContactFirstName() {
		return ContactFirstName;
	}

	public void setContactFirstName(String contactFirstName) {
		ContactFirstName = contactFirstName;
	}

	public String getContactMiddleName() {
		return ContactMiddleName;
	}

	public void setContactMiddleName(String contactMiddleName) {
		ContactMiddleName = contactMiddleName;
	}

	public String getContactLastName() {
		return ContactLastName;
	}

	public void setContactLastName(String contactLastName) {
		ContactLastName = contactLastName;
	}

	public boolean getActiveFlg() {
		return ActiveFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		ActiveFlg = activeFlg;
	}

	public Set<ProjectEventContact> getProjectEventContacts() {
		return ProjectEventContacts;
	}

	public void setProjectEventContacts(
			Set<ProjectEventContact> projectEventContacts) {
		ProjectEventContacts = projectEventContacts;
	}

	public Set<ContactEmail> getContactEmails() {
		return ContactEmails;
	}

	public void setContactEmails(Set<ContactEmail> contactEmails) {
		ContactEmails = contactEmails;
	}

	public Set<VendContact> getVendContacts() {
		return VendContacts;
	}

	public void setVendContacts(Set<VendContact> vendContacts) {
		VendContacts = vendContacts;
	}

}
