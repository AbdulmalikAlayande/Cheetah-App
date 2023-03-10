package data.models;

import java.time.LocalDateTime;
import java.util.List;

public class Package {
	
	private int packageId;
	private double packageWeightInGrammes;
	private User senderDetails;
	private User receiverDetails;
	private LocalDateTime timeCreated;
	private List<Event> status;
	private boolean payOnDelivery;
	
	public int getPackageId() {
		return packageId;
	}
	
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	
	public double getPackageWeightInGrammes() {
		return packageWeightInGrammes;
	}
	
	public void setPackageWeightInGrammes(double packageWeightInGrammes) {
		this.packageWeightInGrammes = packageWeightInGrammes;
	}
	
	public User getSenderDetails() {
		return senderDetails;
	}
	
	public void setSenderDetails(User senderDetails) {
		this.senderDetails = senderDetails;
	}
	
	public User getReceiverDetails() {
		return receiverDetails;
	}
	
	public void setReceiverDetails(User receiverDetails) {
		this.receiverDetails = receiverDetails;
	}
	
	public LocalDateTime getTimeCreated() {
		return timeCreated;
	}
	
	public void setTimeCreated(LocalDateTime timeCreated) {
		this.timeCreated = timeCreated;
	}
	
	public List<Event> getStatus() {
		return status;
	}
	
	public void setStatus(List<Event> status) {
		this.status = status;
	}
	
	public boolean isPayOnDelivery() {
		return payOnDelivery;
	}
	
	public void setPayOnDelivery(boolean payOnDelivery) {
		this.payOnDelivery = payOnDelivery;
	}
}
