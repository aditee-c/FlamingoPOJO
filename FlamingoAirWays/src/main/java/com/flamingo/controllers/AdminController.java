package com.flamingo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flamingo.entities.Admin;
import com.flamingo.services.AdminServicesImpl;

@RestController
public class AdminController {
	@Autowired
	private AdminServicesImpl adminService;

	@GetMapping("/admin/{id}")
	public Admin findAdminById(@PathVariable("id") int adminId) {
		return adminService.findAdminById(adminId);
	}

	@PostMapping("/admin/add")
	public String add(Admin admin) {
		adminService.addAdmin(admin);
		return "new admin is the Boss MF's : " + admin.getAdminId();

	}

	@PostMapping("/admin/update")
	public String update(Admin admin) {
		if (adminService.findAdminById(admin.getAdminId()) != null) {
			adminService.updateAdmin(admin);

			return "admin updated successfuly :" + admin.getAdminId();
		} else {
			return "sorry admin not found!";
		}
	}

	public String removeAdmin(Admin admin) {
		if (adminService.findAdminById(admin.getAdminId()) != null) {
			adminService.removeAdmin(admin);

			return "admin deleted successfuly :" + admin.getAdminId();
		} else {
			return "sorry admin not found!";
		}
	}
}