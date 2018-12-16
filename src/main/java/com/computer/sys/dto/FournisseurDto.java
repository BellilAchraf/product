package com.computer.sys.dto;

import java.io.Serializable;

public class FournisseurDto implements Serializable {

    private String designation;

    private String adresse ;

    private String numero ;

    public FournisseurDto(){

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                ", designation='" + designation + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numero=" + numero +
                '}';
    }

}
