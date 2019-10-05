package com.flamingo.services;

import java.util.List;

import com.flamingo.dao.AdminDao;
import com.flamingo.dao.AdminDaoImpl;
import com.flamingo.entities.Admin;

public class AdminServicesImpl implements AdminServices {
	private AdminDao adminDao;
	public AdminServicesImpl() {
		// TODO Auto-generated constructor stub
		adminDao = new AdminDaoImpl();
	}
	@Override
	public List<Admin> findAllAdmins() {
		// TODO Auto-generated method stub
		return adminDao.getAll();
	}

	@Override
	public Admin findAdminById(int adminId) {
		// TODO Auto-generated method stub
		return adminDao.getById(adminId);
	}

	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.insert(admin);
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.update(admin);
	}

	@Override
	public void removeAdmin(Admin admin) {
		// TODO Auto-generated method stub
		adminDao.delete(admin);
	}

}