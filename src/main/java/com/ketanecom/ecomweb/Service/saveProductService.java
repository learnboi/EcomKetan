package com.ketanecom.ecomweb.Service;

import com.ketanecom.ecomweb.Model.Product;
import com.ketanecom.ecomweb.Repository.saveProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class saveProductService {
    private Product product;
    private saveProductRepository saveProductRepository;

    public String saveProduct(Product product){
        saveProductRepository.save(product);
        return "home";
    }
}
