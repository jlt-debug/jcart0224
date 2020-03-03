package io.jlt.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.jlt.jcartstoreback.dto.out.ProductListOutDTO;
import io.jlt.jcartstoreback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
