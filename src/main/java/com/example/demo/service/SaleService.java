package com.example.demo.service;

import com.example.demo.entity.Sale;
import com.example.demo.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements ISaleService {
    @Autowired
    ISaleRepository saleRepository;
    @Override
    public List<Sale> getAll() {
        return (List<Sale>)saleRepository.findAll();
    }
}
