package com.jlt.jcart.adminsteation.back.controller;

import com.jlt.jcart.adminsteation.back.dto.in.ReturnSearchInDTO;
import com.jlt.jcart.adminsteation.back.dto.in.ReturnUpdateActionInDTO;
import com.jlt.jcart.adminsteation.back.dto.out.PageOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.ReturnListOutDTO;
import com.jlt.jcart.adminsteation.back.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(@RequestParam Integer pageNum, ReturnSearchInDTO returnSearchInDTO){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void uodateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }



}
