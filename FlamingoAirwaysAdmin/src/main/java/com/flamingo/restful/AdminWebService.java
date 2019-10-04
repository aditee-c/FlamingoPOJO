package com.flamingo.restful;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.flamingo.entities.Admin;
import com.flamingo.services.AdminServices;
import com.flamingo.services.AdminServicesImpl;

public class AdminWebService {
	private AdminServices adminService;
	
	public AdminWebService() {
		// TODO Auto-generated constructor stub
		adminService = new AdminServicesImpl();
	}
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Admin> getAllAdmin() {
		return adminService.findAllAdmins();
}
	@GET
	@Path("/{adminId}")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	public Admin getAdmin(@PathParam("adminId") int adminId) {
		return adminService.findAdminById(adminId);
	}
	@POST
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces("text/html")
	public Response add(Admin admin) {
		adminService.addAdmin(admin);
		return Response.status(200).entity("" + admin.getAdminId() + "Added Admin").build();
	}
	@PUT
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces("text/html")
	public Response update(Admin admin) {
		Admin dbadmin = adminService.findAdminById(admin.getAdminId());
		if (dbadmin != null) {
			dbadmin.setUsername(admin.getUsername());
			dbadmin.setAdminId(admin.getAdminId());
			dbadmin.setAdminPassword(admin.getAdminPassword());
			adminService.updateAdmin(dbadmin);
			return Response.status(200).entity("Admin" + dbadmin.getAdminId() + "Updated successfully").build();
		} else {
			return Response.status(200).entity("Admin Not Found").build();
		}
	}
	@DELETE
	@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Produces("text/html")
	public Response remove(Admin admin) {
		Admin dbadmin = adminService.findAdminById(admin.getAdminId());
		if (dbadmin != null) {
			dbadmin.setUsername(admin.getUsername());
			dbadmin.setAdminId(admin.getAdminId());
			dbadmin.setAdminPassword(admin.getAdminPassword());
			adminService.updateAdmin(dbadmin);
			return Response.status(200).entity("Admin" + dbadmin.getAdminId() + "Updated successfully").build();
		} else {
			return Response.status(200).entity("Admin Not Found").build();
		}
}
}
