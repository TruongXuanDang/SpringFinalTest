package com.example.demo.service;
import com.example.demo.entity.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    IProductRepository productRepository;
    @Override
    public List<Product> getAll() {
        List<Product> productList = (List<Product>) productRepository.findAll();
        return productList;
    }
}
