package org.hibernate.Vend.DAO;

public class EventRating implements java.io.Serializable {
	
	private int RatingID;
	private ProjectEvent ProjectEvent;
	private String VolID;
	private int RatingValue;
	private boolean ActiveFlg;
	
	public EventRating(){}

	public int getRatingID() {
		return RatingID;
	}

	public void setRatingID(int ratingID) {
		RatingID = ratingID;
	}

	public ProjectEvent getProjectEvent() {
		return ProjectEvent;
	}

	public void setProjectEvent(ProjectEvent projectEvent) {
		ProjectEvent = projectEvent;
	}

	public String getVolID() {
		return VolID;
	}

	public void setVolID(String volID) {
		VolID = volID;
	}

	public int getRatingValue() {
		return RatingValue;
	}

	public void setRatingValue(int ratingValue) {
		RatingValue = ratingValue;
	}

	public boolean isActiveFlg() {
		return ActiveFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		ActiveFlg = activeFlg;
	};
	
}
