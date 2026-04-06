package com.IMS.Inventory_Management_System.services;

import com.IMS.Inventory_Management_System.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
}
