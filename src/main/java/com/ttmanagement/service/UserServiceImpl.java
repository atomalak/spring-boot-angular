package com.ttmanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ttmanagement.issuemanagement.entity.User;
import com.ttmanagement.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository repository;

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public User getById(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Page<User> getAllPageable(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public User getByUserName(String userName) {
		return repository.getByUserName(userName);
	}

}
