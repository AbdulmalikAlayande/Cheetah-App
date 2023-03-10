package data.repositories;
import data.models.User;

import java.util.List;

public interface IUserRepository {
	User save(User user);
	void delete(User user);
	void delete(int id);
	List<User> findAll();
	User findById(int id);

	int count();
}
