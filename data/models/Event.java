package data.models;

import java.time.LocalDateTime;

public class Event {
	private int eventId;
	private LocalDateTime when;
	private String what;
	private User who;
	
	public int getEventId() {
		return eventId;
	}
	
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public LocalDateTime getWhen() {
		return when;
	}
	
	public void setWhen(LocalDateTime when) {
		this.when = when;
	}
	
	public String getWhat() {
		return what;
	}
	
	public void setWhat(String what) {
		this.what = what;
	}
	
	public User getWho() {
		return who;
	}
	
	public void setWho(User who) {
		this.who = who;
	}
}
