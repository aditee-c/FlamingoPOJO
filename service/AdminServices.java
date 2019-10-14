package com.flamingo.service;

import java.util.List;

import com.flamingo.entities.Admin;


public interface AdminServices {
	List<Admin> findAllAdmins();

	Admin findAdminById(int adminId);

	void addAdmin(Admin admin);

	void updateAdmin(Admin admin);

	void removeAdmin(Admin admin);



	
}