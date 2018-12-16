package com.computer.sys.util;

import com.computer.sys.dto.FournisseurDto;
import com.computer.sys.dto.ProductDto;
import com.computer.sys.entities.Fourniseur;
import com.computer.sys.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class EntityToDto {

    public  static   List<ProductDto> mapProductsToProductsDto(List<Product> products){
        List<ProductDto> productDtoList = new ArrayList<>();
        for(Product product : products){
            productDtoList.add(mapProductToProductDto(product));
        }
        return productDtoList;
    }

    public static ProductDto mapProductToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setDesignation(product.getDesignation());
        productDto.setDescription(product.getDescription());
        productDto.setCreationDate(product.getCreationDate());
        productDto.setEndDate(product.getEndDate());
        return productDto;
    }

    public  static   List<FournisseurDto> mapFournisseursToFournisseursDto(List<Fourniseur> fourniseurs){
        List<FournisseurDto> FournisseurDtoList = new ArrayList<>();
        for(Fourniseur fourniseur : fourniseurs){
            FournisseurDtoList.add(mapFournisseurToFournisseurDto(fourniseur));
        }
        return FournisseurDtoList;
    }

    public static FournisseurDto mapFournisseurToFournisseurDto(Fourniseur fournisseur){
        FournisseurDto fournisseurDto = new FournisseurDto();
        fournisseurDto.setDesignation(fournisseur.getDesignation());
        fournisseurDto.setAdresse(fournisseur.getAdresse());
        fournisseurDto.setNumero(fournisseur.getPhoneNumber());
        return fournisseurDto;
    }
}
