package com.ketanecom.ecomweb.Controller;

import com.ketanecom.ecomweb.Model.Product;
import com.ketanecom.ecomweb.Service.saveProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/save")
public class SaveController {
    private saveProductService saveProductService;
    @PostMapping
    public String saveProduct(Product product){
        return saveProductService.saveProduct(product);
    }
}
