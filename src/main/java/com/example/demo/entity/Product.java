package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @Column(name = "prodname")
    private String prodname;

    @Column(name = "description")
    private String description;

    @Column(name = "dateofman")
    private String dateofman;

    @Column(name = "price")
    private Integer price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateofman() {
        return dateofman;
    }

    public void setDateofman(String dateofman) {
        this.dateofman = dateofman;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
//
//    @OneToMany(targetEntity=Sale.class,cascade=CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Sale> sales = new ArrayList<>();
}
