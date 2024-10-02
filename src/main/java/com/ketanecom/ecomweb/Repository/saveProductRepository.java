package com.ketanecom.ecomweb.Repository;

import com.ketanecom.ecomweb.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface saveProductRepository extends JpaRepository<Product, Long> {

}
