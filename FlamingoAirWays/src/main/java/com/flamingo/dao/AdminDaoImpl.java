package com.flamingo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.flamingo.entities.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	/*
	 * public List<Admin> getAll() { // TODO Auto-generated method stub return
	 * (List<Admin>) hibernateTemplate.find("from ");
	 * 
	 * }
	 */

	public Admin getById(int adminId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Admin.class, adminId);
	}

	public void insert(Admin admin) {
		hibernateTemplate.save(admin);
	}

	public void update(Admin admin) {
		hibernateTemplate.update(admin);
	}

	public void delete(Admin admin) {
		hibernateTemplate.delete(admin);
	}

}