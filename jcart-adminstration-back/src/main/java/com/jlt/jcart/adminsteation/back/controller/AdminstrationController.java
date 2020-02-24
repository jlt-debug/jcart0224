package com.jlt.jcart.adminsteation.back.controller;

import com.jlt.jcart.adminsteation.back.dto.in.AdminstrationLoginDTO;
import com.jlt.jcart.adminsteation.back.dto.in.AdminstrationUpdateProfileDTO;
import com.jlt.jcart.adminsteation.back.dto.out.AdminstartionGetProdfileOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adminstration")
public class AdminstrationController {

    @GetMapping("/login")
    public String login(AdminstrationLoginDTO adminstrationLoginDTO){



        return null;
    }

    @GetMapping("/getprofile")
    public AdminstartionGetProdfileOutDTO getProfile(Integer adminstratorId){
        return null;
    }


    @PostMapping("/updateProdfile")
    public String updateProdfile(@RequestParam AdminstrationUpdateProfileDTO adminstrationUpdateProfileDTO){
        return  null;
    }

}
