package com.jlt.jcart.store.back.controller;


import com.jlt.jcart.store.back.dto.in.OrderCheckoutInDTO;
import com.jlt.jcart.store.back.dto.out.OrderListOutDTO;
import com.jlt.jcart.store.back.dto.out.OrderShowOutDTO;
import com.jlt.jcart.store.back.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
