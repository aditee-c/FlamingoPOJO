package com.zensar.restful;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;
import com.zensar.services.ProductServiceImpl;

/**
 * @author CHARAN R
 * @creation date: 4th oct 2019 2:03am
 * @modification date: 4th oct 2019 2:03am
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
@Path("/products")
public class ProductWebService {
	private ProductService productServ;

	public ProductWebService() {
		// TODO Auto-generated constructor stub
		productServ = new ProductServiceImpl();
	}
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAllProducts()
	{
		return productServ.findallProduct();
	}
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Product getProduct(@PathParam("id") int productId)
	{
		return productServ.findProductsById(productId);
		
	}
	
	@GET
	@Path("/count")
	@Produces("text/html")
	public Response getProductCount()
	{
		long count= productServ.getProductCount();
		return Response.status(200).entity("<p><h1>Number of products:"+" "+count).build();
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces("text/html")
	public Response add(Product product)
	{
	    productServ.addproduct(product);
		return Response.status(200).entity(product.getProductId()+"added in the table").build();
	}
	
	
	
	@PUT
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces("text/html")
	public Response upadte(Product product)
	{
		Product dbproduct=productServ.findProductsById(product.getProductId());
		if(dbproduct!=null)
		{
			dbproduct.setName(product.getName());
			dbproduct.setBrand(product.getBrand());
			dbproduct.setPrice(product.getPrice());
			productServ.updateProduct(dbproduct);
			return Response.status(200).entity(dbproduct.getProductId()+"table updated successfully!!!").build();
		}
		else
		{
			return Response.status(200).entity("sorry product not found").build();
		}
	}
	
	
	@DELETE
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces("text/html")
	public Response remove(Product product)
	{
		Product dbproduct=productServ.findProductsById(product.getProductId());
		if(dbproduct!=null)
		{
			productServ.removeProduct(dbproduct);
			return Response.status(200).entity(dbproduct.getProductId()+"deleted successfully!!!").build();
		}
		else
		{
			return Response.status(200).entity("sorry product not found").build();
		}
	}
	
	
	@POST
	@Path("/pricerange")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getByPricerange(@FormParam("min")float minprice,@FormParam("max")float maxprice)
	{
		return productServ.findProductByPriceRange(minprice, maxprice);
		
	}
	
	@POST
	@Path("/name")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getByName(@FormParam("nam")String name)
	{
		return productServ.findProductByName(name);
		
	}

}
