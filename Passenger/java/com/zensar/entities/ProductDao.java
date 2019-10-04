package com.zensar.entities;

import java.util.List;

/**
 * @author CHARAN R
 * @creation date: 4th oct 2019 9:58am
 * @modification date: 4th oct 2019 9:58am
 * @version 1.0
 * @copyright Zensar technologies ltd, all rights reserved
 *
 */
public interface ProductDao {

	List<Product> getAll();

	Product getById(int prod_id);

	void insert(Product product);

	void update(Product product);

	void delete(Product product);
}
