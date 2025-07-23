package com.mengzhou.mapper;

import com.mengzhou.dto.ProductDTO;
import com.mengzhou.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);
    Product fromDTO(ProductDTO dto);

}

