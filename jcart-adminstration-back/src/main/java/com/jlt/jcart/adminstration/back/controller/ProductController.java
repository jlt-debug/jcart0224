package com.jlt.jcart.adminstration.back.controller;

import com.github.pagehelper.Page;
import com.jlt.jcart.adminstration.back.dto.in.ProductCreateInDTO;
import com.jlt.jcart.adminstration.back.dto.in.ProductSearchInDTO;
import com.jlt.jcart.adminstration.back.dto.in.ProductUpdateInDTO;
import com.jlt.jcart.adminstration.back.dto.out.PageOutDTO;
import com.jlt.jcart.adminstration.back.dto.out.ProductListOutDTO;
import com.jlt.jcart.adminstration.back.dto.out.ProductShowOutDTO;
import com.jlt.jcart.adminstration.back.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam(required = false ,defaultValue = "1") Integer pageNum , ProductSearchInDTO productSearchInDTO){

        Page<ProductListOutDTO> page = productService.search(pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);


        return pageOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);


        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productService.batchDelete(productIds);
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }




}
