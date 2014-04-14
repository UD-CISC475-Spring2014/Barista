package org.hibernate.Vend;

import java.util.HashSet;
import java.util.Set;

public class Vendor {
	private String VendorID;
	private String VendorName;
	private boolean ActiveFlg;
	
	private Set<VendContact> VendContacts = new HashSet<VendContact>();
	
	public Vendor(){}

	public String getVendorID() {
		return VendorID;
	}

	public void setVendorID(String vendorID) {
		VendorID = vendorID;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public boolean isActiveFlg() {
		return ActiveFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		ActiveFlg = activeFlg;
	}

	public Set<VendContact> getVendContacts() {
		return VendContacts;
	}

	public void setVendContacts(Set<VendContact> vendContacts) {
		VendContacts = vendContacts;
	}
	
	
}
