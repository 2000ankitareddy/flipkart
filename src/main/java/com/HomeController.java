package com.flipkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {

        return """
        <html>
        <head>
            <title>Flipkart Clone</title>
            <style>
                body{
                    font-family: Arial;
                    background-color:#f1f3f6;
                    margin:0;
                }
                header{
                    background:#2874f0;
                    color:white;
                    padding:15px;
                    text-align:center;
                    font-size:28px;
                }
                .products{
                    display:flex;
                    justify-content:center;
                    gap:30px;
                    margin-top:40px;
                }
                .card{
                    background:white;
                    padding:20px;
                    width:200px;
                    text-align:center;
                    box-shadow:0 2px 8px rgba(0,0,0,0.2);
                    border-radius:10px;
                }
                img{
                    width:150px;
                    height:150px;
                }
                button{
                    background:#fb641b;
                    color:white;
                    border:none;
                    padding:10px;
                    cursor:pointer;
                    margin-top:10px;
                }
            </style>
        </head>

        <body>

        <header>Flipkart Online Store</header>

        <div class="products">

            <div class="card">
                <img src="https://m.media-amazon.com/images/I/71d7rfSl0wL._SX679_.jpg">
                <h3>iPhone 15</h3>
                <p>₹79,999</p>
                <button>Buy Now</button>
            </div>

            <div class="card">
                <img src="https://m.media-amazon.com/images/I/71TPda7cwUL._SX679_.jpg">
                <h3>Laptop</h3>
                <p>₹55,000</p>
                <button>Buy Now</button>
            </div>

            <div class="card">
                <img src="https://m.media-amazon.com/images/I/61y2VVWcGBL._SX679_.jpg">
                <h3>Headphones</h3>
                <p>₹2,999</p>
                <button>Buy Now</button>
            </div>

        </div>

        </body>
        </html>
        """;
    }
}
