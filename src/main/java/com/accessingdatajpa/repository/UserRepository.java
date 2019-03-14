package com.accessingdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.accessingdatajpa.model.User;

public interface UserRepository  extends CrudRepository<User, Integer> {

}