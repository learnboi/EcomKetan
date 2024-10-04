package com.ketanecom.ecomweb.Repository;

import com.ketanecom.ecomweb.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
