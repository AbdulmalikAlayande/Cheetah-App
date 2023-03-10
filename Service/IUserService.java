package Service;

import data.models.User;
import dto.Request.RegisteredUserRequest;

public interface IUserService {
	User registerNewUser(RegisteredUserRequest userRequested);
	User findUser(int id);
}
