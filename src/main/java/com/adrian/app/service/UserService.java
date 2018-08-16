package com.adrian.app.service;

import com.adrian.app.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);
}