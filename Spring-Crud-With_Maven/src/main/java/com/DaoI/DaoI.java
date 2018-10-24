package com.DaoI;

import org.springframework.data.repository.CrudRepository;

import com.model.Login;
import com.model.User;

public interface DaoI extends CrudRepository<Login, Integer>{
public Login findAllByUnAndPw(String un,String pw);
}
