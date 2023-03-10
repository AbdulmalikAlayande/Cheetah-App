package data.repositories;
import data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements IUserRepository{
	private int usersLastIdCreated;
	private List<User> users = new ArrayList<>();
	@Override
	public User save(User user) {
		boolean isNotSaved = user.getUserId() == 0;
		boolean isSaved = user.getUserId() != 0;
		if (isNotSaved)
			saveNewUser(user);
		else if (isSaved)
			updateExistingUser(user);
		return user;
	}
	
	private void updateExistingUser(User user) {
		int savedUserId = user.getUserId();
		User savedUser = findById(savedUserId);
		users.remove(savedUser);
		users.add(user);
	}
	
	private void saveNewUser(User user) {
		int userId = generateUserId();
		user.setUserId(userId);
		users.add(user);
		usersLastIdCreated +=1;
	}
	
	private int generateUserId() {
		return usersLastIdCreated +1;
	}
	
	@Override
	public void delete(User user) {
		users.remove(user);
	}
	
	@Override
	public void delete(int id) {
		User savedUser = findById(id);
		delete(savedUser);
	}
	
	@Override
	public List<User> findAll() {
		return null;
	}
	
	@Override
	public User findById(int id) {
		for (User user: users) {
			boolean isFoundId = user.getUserId() == id;
			if (isFoundId)
				return user;
		}
		return null;
	}
	
	@Override
	public int count() {
		return users.size();
	}
}
