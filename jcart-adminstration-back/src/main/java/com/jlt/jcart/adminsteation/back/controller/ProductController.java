package com.jlt.jcart.adminsteation.back.controller;

import com.jlt.jcart.adminsteation.back.dto.in.ProductCreateInDTO;
import com.jlt.jcart.adminsteation.back.dto.in.ProductSearchInDTO;
import com.jlt.jcart.adminsteation.back.dto.in.ProductUpdateInDTO;
import com.jlt.jcart.adminsteation.back.dto.out.CustomerShowOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.PageOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.ProductListOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(@RequestParam Integer pageNum , ProductSearchInDTO productSearchInDTO){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }


    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }




}
