package org.hibernate.Vend.DAO;

import java.util.List;

import org.hibernate.Vend.DAO.Contact;
import org.hibernate.Vend.DAO.Address;
import org.hibernate.Vend.DAO.Project;


public class Vendor {
	
	private String vendorName;
	//Must be unique
	private String email;
	//TODO: Find a way to ensure password is securly transferred and stuff
	private String password;
	//This is to give an idea of how Volunteers enjoyed participating with events?
	private int eventRating;
	private List<Project> projects;
	private Contact contactInfo;
	private Address vendAddress;
	//maybe get this if everything else works
	//IE: Will never be implemented but it's a nice idea
	//private String description;
	//I don't know if we need this in the DAO
	private int GUID;
	//This boolean is initalized to false and must be manually flipped
	//when the Vendor is activated (after verification by Admin)
	//It can be set to false again manually or by attempting to 'delete' an account.
	//Sorry Andrew, Gibbons wants us to pull a Skype.
	private boolean activeFlag;

	public Vendor(String vendorName, String email, int eventRating,
			List<Project> projects, Contact contactInfo, Address vendAddress,
			int gUID) {
		super();
		this.vendorName = vendorName;
		this.email = email;
		this.eventRating = eventRating;
		this.projects = projects;
		this.contactInfo = contactInfo;
		this.vendAddress = vendAddress;
		GUID = gUID;
		this.setActiveFlag(false);
	}
	/**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}
	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the eventRating
	 */
	public int getEventRating() {
		return eventRating;
	}
	/**
	 * @param eventRating the eventRating to set
	 */
	public void setEventRating(int eventRating) {
		this.eventRating = eventRating;
	}
	/**
	 * @return the projects
	 */
	public List<Project> getProjects() {
		return projects;
	}
	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	/**
	 * @return the contactInfo
	 */
	public Contact getContactInfo() {
		return contactInfo;
	}
	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}
	/**
	 * @return the vendAddress
	 */
	public Address getVendAddress() {
		return vendAddress;
	}
	/**
	 * @param vendAddress the vendAddress to set
	 */
	public void setVendAddress(Address vendAddress) {
		this.vendAddress = vendAddress;
	}
	/**
	 * @return the gUID
	 */
	public int getGUID() {
		return GUID;
	}
	public boolean isActive() {
		return activeFlag;
	}
	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}
}
