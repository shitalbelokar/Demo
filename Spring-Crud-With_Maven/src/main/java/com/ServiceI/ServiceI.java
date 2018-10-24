package com.ServiceI;

import java.util.List;

import com.model.Login;
import com.model.User;

public interface ServiceI {
public Login findAllByUnAndPw(String un,String pw);
public User saveData(Login l,User u);
public List<User> getAllRecord(); 
//public Login loginUser(Login l);
public void deleteUser(int uid);
public User editdata(int uid);
public User updateUser(Login l,User u);

	

}
