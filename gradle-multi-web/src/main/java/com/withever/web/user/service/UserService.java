package com.withever.web.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.withever.model.User;
import com.withever.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User save(User data) {
		return userRepository.save(data);
	}
}
