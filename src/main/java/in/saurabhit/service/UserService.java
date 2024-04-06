package in.saurabhit.service;

import java.util.List;

import in.saurabhit.entity.User;
import in.saurabhit.payload.UserDao;

public interface UserService {
	
	UserDao createUser(UserDao userDao);
	
	UserDao updateUserDetails(UserDao userDao,Integer userId);
	 UserDao getUserById(Integer userId);
	
	 void deleteUser(Integer userId);
	 List<UserDao> getAllUsers();

}
