package com.ketanecom.ecomweb.Controller;

import com.ketanecom.ecomweb.Model.Product;
import com.ketanecom.ecomweb.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductRepository productRepository;


}
