package com.computer.sys.entities;


import javax.persistence.*;

@Entity
@Table(name = "PRICE")
public class Price {

    @Id
    @GeneratedValue
    @Column(name = "FRS_PROD_ID")
    private int id;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PROD_ID")
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FRS_ID")
    private Fourniseur fourniseur;

    @Column(name = "AMOUNT")
    private double amount;

    public Price() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Fourniseur getFourniseur() {
        return fourniseur;
    }

    public void setFourniseur(Fourniseur fourniseur) {
        this.fourniseur = fourniseur;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
