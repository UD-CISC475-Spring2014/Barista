package org.hibernate.Vend;

public class Project {
	private String ProjectID;
	private String ProjectName;
	private String ProjectDesc;
	private int AddrID;
	private boolean ActiveFlg;
	
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

	public int getAddrID() {
		return AddrID;
	}

	public void setAddrID(int addrID) {
		AddrID = addrID;
	}

	public boolean isActiveFlg() {
		return ActiveFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		ActiveFlg = activeFlg;
	};
	
	
}
