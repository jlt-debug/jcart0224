package com.jlt.jcart.adminstration.back.service;

import com.github.pagehelper.Page;
import com.jlt.jcart.adminstration.back.dto.in.ProductCreateInDTO;
import com.jlt.jcart.adminstration.back.dto.in.ProductUpdateInDTO;
import com.jlt.jcart.adminstration.back.dto.out.ProductListOutDTO;
import com.jlt.jcart.adminstration.back.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {


    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);
}
