package com.ketanecom.ecomweb.Controller;

import com.ketanecom.ecomweb.Dto.UserDto;
import com.ketanecom.ecomweb.Model.User;
import com.ketanecom.ecomweb.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
public class LoginController {

    private String emailtemp;

    @RequestMapping("signup")
    public String signup(){
        return "signup";
    }


    @RequestMapping("login")
    public String login(){
        return "login";
    }

    @Autowired
    private UserRepository UserRepository;

    @GetMapping("signup-data")
    public String signupDetails(@RequestParam String name, @RequestParam Long phone, @RequestParam String email, @RequestParam String password, Model model){
        User user = new User(name, phone, email, password);
        UserRepository.save(user);
        System.out.println("User saved");
        return "login";
    }

    @GetMapping("login-data")
    public String loginDetails(@RequestParam String email, @RequestParam String password, Model model){
        User user = UserRepository.findByEmail(email);  // Use lowercase 'userRepository'
        if(user == null){
            model.addAttribute("error", "Email not found");
            return "login";  // Stay on login page, show error
        }else{
            if(user.getPassword().matches(password)){
                emailtemp = email;// Secure check
                return "index";  // Successful login
            }
            model.addAttribute("error", "Incorrect password");
            return "login";  // Stay on login, show error
        }
    }

    @RequestMapping("cart")
    public String cart(Model model) {
        User user = UserRepository.findByEmail(emailtemp); // Fetch the logged-in user by email
        if (user == null) {
            user = new User(); // Handle case if user is not found
            user.setName("Guest");
        }
        model.addAttribute("user", user);
        System.out.println(emailtemp);
        System.out.println("User saved");
        return "cart"; // Returns the cart.html view
    }

}
