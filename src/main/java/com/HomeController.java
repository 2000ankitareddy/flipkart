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
            products.append("""
            <div class='card'>
                <img src='https://m.media-amazon.com/images/I/71d7rfSl0wL._SX679_.jpg'>
                <h4>Product """+ i +"""</h4>
                <p>₹""" + (1000 + i*10) + """</p>
                <button>Buy Now</button>
            </div>
            """);
        }

        return """
        <html>
        <head>
        <title>Flipkart Store</title>

        <style>

        body{
            font-family:Arial;
            background:#f1f3f6;
            margin:0;
        }

        header{
            background:#2874f0;
            color:white;
            padding:20px;
            font-size:30px;
            text-align:center;
        }

        .grid{
            display:grid;
            grid-template-columns: repeat(12, 1fr);
            gap:15px;
            padding:20px;
        }

        .card{
            background:white;
            padding:10px;
            text-align:center;
            border-radius:8px;
            box-shadow:0 2px 6px rgba(0,0,0,0.2);
        }

        img{
            width:120px;
            height:120px;
        }

        button{
            background:#fb641b;
            border:none;
            padding:8px;
            color:white;
            cursor:pointer;
            margin-top:5px;
        }

        </style>

        </head>

        <body>

        <header>Flipkart Online Shopping</header>

        <div class='grid'>
        """ + products + """
        </div>

        </body>
        </html>
        """;
    }
}
