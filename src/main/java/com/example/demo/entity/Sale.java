package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "sale")
public class Sale {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @Column(name = "sino")
    private String sino;

    @Column(name = "salesmanid")
    private Integer salesmanid;

    @Column(name = "prodid")
    private Integer prodid;

    @Column(name = "salesmanname")
    private String salesmanname;

    @Column(name = "dos")
    private String dos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSino() {
        return sino;
    }

    public void setSino(String sino) {
        this.sino = sino;
    }

    public Integer getSalesmanid() {
        return salesmanid;
    }

    public void setSalesmanid(Integer salesmanid) {
        this.salesmanid = salesmanid;
    }

    public Integer getProdid() {
        return prodid;
    }

    public void setProdid(Integer prodid) {
        this.prodid = prodid;
    }

    public String getSalesmanname() {
        return salesmanname;
    }

    public void setSalesmanname(String salesmanname) {
        this.salesmanname = salesmanname;
    }

    public String getDos() {
        return dos;
    }

    public void setDos(String dos) {
        this.dos = dos;
    }
//
//    @ManyToOne()
//    @JoinColumn(name="prodid")
//    public Product product;
}
