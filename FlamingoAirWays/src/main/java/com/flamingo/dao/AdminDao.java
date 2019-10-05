package com.flamingo.dao;

import java.util.List;

import com.flamingo.entities.Admin;

public interface AdminDao {
	List<Admin> getAll();

	Admin getById(int adminId);

	void insert(Admin admin);

	void update(Admin admin);

	void delete(Admin admin);
}