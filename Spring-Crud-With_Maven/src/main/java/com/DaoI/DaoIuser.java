package com.DaoI;

import org.springframework.data.repository.CrudRepository;

import com.model.User;

public interface DaoIuser extends CrudRepository<User, Integer> {

}
