package com.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoI.DaoI;
import com.DaoI.DaoIuser;
import com.ServiceI.ServiceI;
import com.model.Login;
import com.model.User;

@Service
public class ServiceImpl implements  ServiceI{
@Autowired
DaoI di;
@Autowired
DaoIuser diu;

@Override
public User saveData(Login l, User u) {
	System.out.println("in savedata serviceimpl");
	User lg=diu.save(u);
	return lg;
}

@Override
public List<User> getAllRecord() {
	System.out.println("in serviceImpl getallrecord");
	List<User> ul=(List<User>) diu.findAll();
	System.out.println("find all"+ul);
	return ul;
}

/*public Login loginUser(Login l) {
	System.out.println("in serviceimpl loginuser");
	Login lg=di.findAllByUnAndPw(l.getUn(), l.getPw());
	return lg;
}
*/
@Override
public void deleteUser(int uid) {
	System.out.println("in serviceimpl deletedata");
	System.out.println(uid);
	diu.delete(uid);	
}

@Override
public User editdata(int uid) {
	System.out.println("in serviceimpl editdata");
	User l=diu.findOne(uid);
	return l;
}

@Override
public User updateUser(Login l, User u) {
	System.out.println("in serviceimpl updateUser");
	User lg= diu.save(u);
	return lg;
}

@Override
public Login findAllByUnAndPw(String un, String pw) {
	Login lg=di.findAllByUnAndPw(un,pw);
	return lg;
}
}
