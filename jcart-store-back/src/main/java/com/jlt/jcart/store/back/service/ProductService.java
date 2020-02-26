package com.jlt.jcart.store.back.service;


import com.github.pagehelper.Page;
import com.jlt.jcart.store.back.dto.out.ProductListOutDTO;
import com.jlt.jcart.store.back.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
