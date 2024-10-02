package com.ketanecom.ecomweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ketanecom.ecomweb.Model.Product;
import com.ketanecom.ecomweb.Service.CartItem;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    // Static list to hold cart items
    private static List<CartItem> cart = new ArrayList<>();

    @GetMapping
    public String showCart(Model model) {
        double total = cart.stream().mapToDouble(CartItem::getTotalPrice).sum();
        model.addAttribute("cart", cart);
        model.addAttribute("total", total);
        return "cart";
    }

    @PostMapping("/add/{productId}")
    public String addToCart(@PathVariable int productId) {
        Product product = getProductById(productId);
        CartItem item = findItemByProductId(productId);

        if (item == null) {
            cart.add(new CartItem(product, 1));
        } else {
            item.setQuantity(item.getQuantity() + 1);
        }

        return "redirect:/cart";
    }

    @PostMapping("/update/{productId}/{action}")
    public String updateQuantity(@PathVariable int productId, @PathVariable String action) {
        CartItem item = findItemByProductId(productId);

        if (item != null) {
            if ("increase".equals(action)) {
                item.setQuantity(item.getQuantity() + 1);
            } else if ("decrease".equals(action) && item.getQuantity() > 1) {
                item.setQuantity(item.getQuantity() - 1);
            }
        }

        return "redirect:/cart";
    }

    @PostMapping("/remove/{productId}")
    public String removeItem(@PathVariable int productId) {
        CartItem item = findItemByProductId(productId);

        if (item != null) {
            cart.remove(item);
        }

        return "redirect:/cart";
    }

    private CartItem findItemByProductId(int productId) {
        return cart.stream().filter(i -> i.getProduct().getId() == productId).findFirst().orElse(null);
    }

    private Product getProductById(int id) {
        if (id == 1) {
            return new Product(1, "Wireless Headphones", "/images/headphones.jpg", 7999.00);
        } else if (id == 2) {
            return new Product(2, "Smartphone Case", "/images/smartphone_case.jpg", 999.00);
        }
        return null;
    }
}
