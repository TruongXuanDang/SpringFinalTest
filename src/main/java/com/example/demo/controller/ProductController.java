package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.Sale;
import com.example.demo.service.ProductService;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/product")
    public String index(Model model){
        List<Product> lsProduct = productService.getAll();
        model.addAttribute("lsProduct",lsProduct);
        return "product/indexproduct";
    }
}
