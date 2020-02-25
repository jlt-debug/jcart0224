package com.jlt.jcart.adminsteation.back.controller;

import com.jlt.jcart.adminsteation.back.dto.in.ReturnHistoryCreateInDTO;
import com.jlt.jcart.adminsteation.back.dto.out.ReturnHistoryOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnHistory")
public class ReturnHistoryController {

    @GetMapping("/getListByReturnId")
    public List<ReturnHistoryOutDTO> getListByReturnId(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        return null;
    }
}
