package com.example.demo.repository;

import com.example.demo.entity.Sale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISaleRepository extends CrudRepository<Sale,Integer> {

}
