package com.flipkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {

        StringBuilder products = new StringBuilder();

        for(int i=1;i<=108;i++){
            products.append(
            "<div class='card'>"+
            "<img src='https://m.media-amazon.com/images/I/71d7rfSl0wL._SX679_.jpg'>"+
            "<h4>Product "+i+"</h4>"+
            "<p>₹"+(999+i*5)+"</p>"+
            "<button>Add to Cart</button>"+
            "</div>"
            );
        }

        return """
        <html>

        <head>
        <title>Flipkart Clone</title>

        <style>

        body{
            margin:0;
            font-family:Arial;
            background:#f1f3f6;
        }

        /* NAVBAR */

        .navbar{
            background:#2874f0;
            color:white;
            padding:10px 40px;
            display:flex;
            align-items:center;
            gap:30px;
        }

        .logo{
            font-size:26px;
            font-weight:bold;
        }

        .search{
            flex:1;
        }

        .search input{
            width:100%;
            padding:8px;
            border:none;
            border-radius:3px;
        }

        .cart{
            background:#fb641b;
            padding:8px 15px;
            border-radius:4px;
            cursor:pointer;
        }

        /* CATEGORY BAR */

        .categories{
            display:flex;
            justify-content:center;
            gap:40px;
            background:white;
            padding:12px;
            box-shadow:0 1px 3px rgba(0,0,0,0.2);
        }

        .categories span{
            font-weight:500;
            cursor:pointer;
        }

        /* BANNER */

        .banner{
            width:100%;
            height:250px;
            background:url('https://rukminim2.flixcart.com/fk-p-flap/1600/270/image/8f7fcd90f9c50b8c.jpg') center/cover;
        }

        /* PRODUCT GRID */

        .grid{
            display:grid;
            grid-template-columns: repeat(12,1fr);
            gap:15px;
            padding:20px;
        }

        .card{
            background:white;
            padding:12px;
            text-align:center;
            border-radius:8px;
            transition:0.3s;
            box-shadow:0 2px 5px rgba(0,0,0,0.15);
        }

        .card:hover{
            transform:scale(1.05);
            box-shadow:0 4px 12px rgba(0,0,0,0.3);
        }

        .card img{
            width:120px;
            height:120px;
        }

        .card button{
            background:#fb641b;
            border:none;
            color:white;
            padding:7px 12px;
            cursor:pointer;
            margin-top:5px;
        }

        </style>

        </head>

        <body>

        <!-- NAVBAR -->

        <div class='navbar'>
            <div class='logo'>Flipkart</div>
            <div class='search'><input placeholder='Search for products'></div>
            <div class='cart'>Cart</div>
        </div>

        <!-- CATEGORY -->

        <div class='categories'>
            <span>Mobiles</span>
            <span>Electronics</span>
            <span>Fashion</span>
            <span>Home</span>
            <span>Appliances</span>
            <span>Travel</span>
        </div>

        <!-- BANNER -->

        <div class='banner'></div>

        <!-- PRODUCTS -->

        <div class='grid'>
        """ + products + """
        </div>

        </body>

        </html>
        """;
    }
}
