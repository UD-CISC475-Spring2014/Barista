package org.hibernate.Vend;

import java.util.HashSet;
import java.util.Set;

public class VendEmail {
	
	private int EmailID;
	private String EmailAddr;
	private boolean ActiveFlg;
	
	private Set<ContactEmail> ContactEmails = new HashSet<ContactEmail>();

	public VendEmail() {}

	public int getEmailID() {
		return EmailID;
	}

	public void setEmailID(int emailID) {
		EmailID = emailID;
	}

	public String getEmailAddr() {
		return EmailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		EmailAddr = emailAddr;
	}

	public Set<ContactEmail> getContactEmails() {
		return ContactEmails;
	}

	public void setContactEmails(Set<ContactEmail> contactEmails) {
		ContactEmails = contactEmails;
	}

	public boolean isActiveFlg() {
		return ActiveFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		ActiveFlg = activeFlg;
	}

	
}
