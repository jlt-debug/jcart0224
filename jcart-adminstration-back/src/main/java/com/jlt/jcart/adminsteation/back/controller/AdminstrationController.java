package com.jlt.jcart.adminsteation.back.controller;

import com.jlt.jcart.adminsteation.back.dto.in.*;
import com.jlt.jcart.adminsteation.back.dto.out.AdminstartionGetProdfileOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.AdminstrationListOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.AdminstrationShowOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adminstration")
public class AdminstrationController {

    @GetMapping("/login")
    public String login(AdminstrationLoginDTO adminstrationLoginDTO){
        return null;
    }

    @GetMapping("/getprofile")
    public AdminstartionGetProdfileOutDTO getProfile(@RequestParam(required = false) Integer adminstratorId){

        return null;
    }


    @PostMapping("/updateProfile")
    public String updateProfile(@RequestBody AdminstrationUpdateProfileDTO adminstrationUpdateProfileDTO){
        return null;
    }

    @GetMapping("/getPwdRestCode")
    public String getPwdRestCode(@RequestParam String eamil){

        return null;
    }

    @PostMapping("/getRestPwd")
    public void getRestPwd(@RequestBody AdminstrationRestPwdDTO adminstrationRestPwdDTO){

    }

    @GetMapping("/getList")
    public PageOutDTO<AdminstrationListOutDTO> getList(@RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public AdminstrationShowOutDTO getById(@RequestParam Integer adminstratorId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AdminstrationCreateInDTO adminstrationCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AdminstrationUpdateInDTO adminstrationUpdateInDTO){

    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer adminstratorId){

    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> adminstratorIds){

    }

}
