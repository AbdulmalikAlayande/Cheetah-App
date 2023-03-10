package dto.Request;

import java.util.StringJoiner;

public class RegisteredUserRequest {
	private String firstName;
	private String lastName;
	
	private String fullName;
	private String email;
	private String phoneNumber;
	private String address;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName() {
		this.fullName = firstName + " " + lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return new StringJoiner(", ", RegisteredUserRequest.class.getSimpleName() + "[\n", "]\n")
				       .add("firstName ==> '" + firstName + "'")
				       .add("\nlastName ==>'" + lastName + "'")
				       .add("\nfullName ==> '" + fullName + "'")
				       .add("\nemail ==> '" + email + "'")
				       .add("\nphoneNumber ==> '" + phoneNumber + "'")
				       .add("\naddress ==> '" + address + "'")
				       .toString();
	}
}
