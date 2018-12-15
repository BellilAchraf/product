package com.computer.sys.util;

import com.computer.sys.dto.ProductDto;
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
}
