package com.flamingo.dao;

import com.flamingo.entities.Admin;

public interface AdminDao {
	

	Admin getById(int adminId);

	void insert(Admin admin);

	void update(Admin admin);

	void delete(Admin admin);
}