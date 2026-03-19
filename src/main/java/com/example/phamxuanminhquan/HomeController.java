package com.example.phamxuanminhquan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        // Return the name of the template file "index.html" without the extension
        return "index";
    }

    @GetMapping("/products")
    public String products() {
        return "products";
    }
}
