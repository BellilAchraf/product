package com.computer.sys.service;

import com.computer.sys.dto.ProductDto;
import com.computer.sys.repository.ProductRepository;
import com.computer.sys.util.EntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDto> getAllProducts(){
        return EntityToDto.mapProductsToProductsDto(productRepository.findAll());
    }
}
