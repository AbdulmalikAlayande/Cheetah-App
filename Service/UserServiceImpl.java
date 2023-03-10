package Service;

import data.models.User;
import data.repositories.UserRepositoryImpl;
import dto.Request.RegisteredUserRequest;

public class UserServiceImpl implements IUserService{
	private UserRepositoryImpl userRepository = new UserRepositoryImpl();
	
	@Override
	public User registerNewUser(RegisteredUserRequest userRequest) {
		User newUser = new User();
		newUser.setFirstName(userRequest.getFirstName());
		newUser.setLastName(userRequest.getLastName());
		newUser.setFullName();
		newUser.setEmail(userRequest.getEmail());
		newUser.setUserAddress(userRequest.getAddress());
		newUser.setPhoneNumber(userRequest.getPhoneNumber());
		return userRepository.save(newUser);
	}
	
	@Override
	public User findUser(int id) {
		return userRepository.findById(id);
	}
}
