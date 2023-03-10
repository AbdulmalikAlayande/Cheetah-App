package data.models;

import java.util.List;

public class User {
	private int userId;
	
	private String firstName;
	private String lastName;
	private String fullName;
	private String userAddress;
	private String phoneNumber;
	private String email;
	private List<Event> status;
	
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName() {
		this.fullName = firstName + " " + lastName;
	}
	
	public String getUserAddress() {
		return userAddress;
	}
	
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Event> getStatus() {
		return status;
	}
	
	public void setStatus(List<Event> status) {
		this.status = status;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("User{");
		sb.append("userId=").append(userId);
		sb.append(", firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append(", fullName='").append(fullName).append('\'');
		sb.append(", userAddress='").append(userAddress).append('\'');
		sb.append(", phoneNumber='").append(phoneNumber).append('\'');
		sb.append(", email='").append(email).append('\'');
		sb.append(", status=").append(status);
		sb.append('}');
		return sb.toString();
	}
}
