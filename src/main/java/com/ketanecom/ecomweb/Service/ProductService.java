package com.ketanecom.ecomweb.Service;

import com.ketanecom.ecomweb.Model.Product;
import com.ketanecom.ecomweb.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}