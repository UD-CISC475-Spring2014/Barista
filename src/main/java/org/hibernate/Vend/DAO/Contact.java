package org.hibernate.Vend.DAO;

import java.util.Set;
import java.util.HashSet;

public class Contact {
	private String ContactId;

	private String ContactFirstName;
	private String ContactMiddleName;
	private String ContactLastName;
	
	private boolean ActiveFlg;

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

}
