package com.example.demo.controller;

import com.example.demo.entity.Sale;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SaleController {
    @Autowired
    private SaleService saleService;

    @RequestMapping("/sale")
    public String index(Model model){
        List<Sale> lsSale = saleService.getAll();
        model.addAttribute("lsSale",lsSale);
        return "sale/indexsale";
    }
}
