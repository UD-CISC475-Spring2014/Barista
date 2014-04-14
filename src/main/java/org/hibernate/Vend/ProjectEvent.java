package org.hibernate.Vend;

import java.util.HashSet;
import java.util.Set;
import java.util.Date;

public class ProjectEvent implements java.io.Serializable {

	private String EventID;
	private String ProjectID;
	private Date StartDateTime;
	private Date EndDateTime;
	private long AddrID;
	
	private Set<EventRating> EventRatings = new HashSet<EventRating>();
	private Set<ProjectEventContact> ProjectEventContracts = new HashSet<ProjectEventContact>();
	
	public ProjectEvent(){}

	public String getEventID() {
		return EventID;
	}

	public void setEventID(String eventId) {
		EventID = eventId;
	}

	public String getProjectID() {
		return ProjectID;
	}

	public void setProjectID(String projectId) {
		ProjectID = projectId;
	}

	public Date getStartDateTime() {
		return StartDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		StartDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return EndDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		EndDateTime = endDateTime;
	}

	public long getAddrID() {
		return AddrID;
	}

	public void setAddrID(long addrId) {
		AddrID = addrId;
	}

	public Set<EventRating> getEventRatings() {
		return EventRatings;
	}

	public void setEventRatings(Set<EventRating> eventRatings) {
		EventRatings = eventRatings;
	}

	public Set<ProjectEventContact> getProjectEventContracts() {
		return ProjectEventContracts;
	}

	public void setProjectEventContracts(
			Set<ProjectEventContact> projectEventContracts) {
		ProjectEventContracts = projectEventContracts;
	};
	
	
	
}
