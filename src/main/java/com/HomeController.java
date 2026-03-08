package com.flipkart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Home page
    @GetMapping("/")
    public String home() {
        return "Welcome to Flipkart Online Shopping Application!";
    }

    // Products API
    @GetMapping("/products")
    public String products() {
        return "Available Products: Mobile Phones, Laptops, Fashion, Electronics";
    }

    // Example product
    @GetMapping("/product/mobile")
    public String mobile() {
        return "Product: iPhone 15 | Price: ₹79,999 | Available on Flipkart";
    }

    // Order API
    @GetMapping("/order")
    public String order() {
        return "Your Flipkart order has been placed successfully!";
    }

    // Offer API
    @GetMapping("/offers")
    public String offers() {
        return "Flipkart Big Billion Days Offer: Up to 70% Off!";
    }
}
