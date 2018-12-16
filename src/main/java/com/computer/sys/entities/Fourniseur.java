package com.computer.sys.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "FOURNISSEUR")
public class Fourniseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FRS_ID")
    private int id;

    @Column(name = "FRS_DESIGNATION")
    private String designation;

    @Column(name = "FRS_ADRESSE")
    private String adresse;

    @Column(name = "FRS_TEL")
    private String phoneNumber;


    @Lazy
    @OneToMany(mappedBy ="fourniseur" )
    @Fetch(FetchMode.JOIN)
    private Set<Price> prices = new HashSet<>();

//    @ManyToMany(fetch = FetchType.LAZY)
//    @Fetch(FetchMode.JOIN)
//    @JoinTable(name = "TJ_PRIX", joinColumns = {@JoinColumn(name = "FRS_ID", nullable = true, updatable = false)}, inverseJoinColumns = {
//            @JoinColumn(name = "PROD_ID", nullable = true, updatable = true)})
//    private Set<Product> products = new HashSet<>(0);



    public Fourniseur() {
    }

    public Set<Price> getPrices() {
        return prices;
    }

    public void setPrices(Set<Price> prices) {
        this.prices = prices;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fourniseur that = (Fourniseur) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Fourniseur{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", adresse='" + adresse + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


}
