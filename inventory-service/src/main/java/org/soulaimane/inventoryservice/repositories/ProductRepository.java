package org.soulaimane.inventoryservice.repositories;

import org.soulaimane.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
