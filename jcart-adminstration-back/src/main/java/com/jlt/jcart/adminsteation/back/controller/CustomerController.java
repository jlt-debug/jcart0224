package com.jlt.jcart.adminsteation.back.controller;

import com.jlt.jcart.adminsteation.back.dto.in.ProductCreateInDTO;
import com.jlt.jcart.adminsteation.back.dto.in.ProductSearchInDTO;
import com.jlt.jcart.adminsteation.back.dto.in.ProductUpdateInDTO;
import com.jlt.jcart.adminsteation.back.dto.out.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {


    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(@RequestParam Integer pageNum , CustomerListOutDTO customerListOutDTO){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }
    //get
    @PostMapping("/disable")
    public Integer disable(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }

}
