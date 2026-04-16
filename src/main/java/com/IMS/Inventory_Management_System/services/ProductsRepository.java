package com.IMS.Inventory_Management_System.services;

import com.IMS.Inventory_Management_System.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameContainingIgnoreCaseOrBrandContainingIgnoreCase(String name, String brand);
}
