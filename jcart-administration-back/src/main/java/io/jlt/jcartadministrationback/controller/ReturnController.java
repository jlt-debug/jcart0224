package io.jlt.jcartadministrationback.controller;

import io.jlt.jcartadministrationback.dto.in.ReturnSearchInDTO;
import io.jlt.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import io.jlt.jcartadministrationback.dto.out.PageOutDTO;
import io.jlt.jcartadministrationback.dto.out.ReturnListOutDTO;
import io.jlt.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
