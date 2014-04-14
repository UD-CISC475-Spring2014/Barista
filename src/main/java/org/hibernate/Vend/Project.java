package org.hibernate.Vend;

import java.util.HashSet;
import java.util.Set;

public class Project {
	private String ProjectID;
	private String ProjectName;
	private String ProjectDesc;
	private VendAddress VendAddress;
	private boolean ActiveFlg;
	
	private Set<VendorProjContact> VendorProjContacts = new HashSet<VendorProjContact>();
	
	
	public Project(){}

	public String getProjectID() {
		return ProjectID;
	}

	public void setProjectID(String projectID) {
		ProjectID = projectID;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public String getProjectDesc() {
		return ProjectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		ProjectDesc = projectDesc;
	}
	
	public VendAddress getVendAddress() {
		return VendAddress;
	}

	public void setVendAddress(VendAddress vendAddress) {
		VendAddress = vendAddress;
	}

	public Set<VendorProjContact> getVendorProjContacts() {
		return VendorProjContacts;
	}

	public void setVendorProjContacts(Set<VendorProjContact> vendorProjContacts) {
		VendorProjContacts = vendorProjContacts;
	}

	public boolean isActiveFlg() {
		return ActiveFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		ActiveFlg = activeFlg;
	};
	
	
}
