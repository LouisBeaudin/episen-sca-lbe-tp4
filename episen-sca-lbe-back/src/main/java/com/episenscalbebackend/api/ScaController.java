package com.episenscalbebackend.api;

import com.episenscalbebackend.util.PrintWrite;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScaController {

    @PostMapping("/add/order")
    public String scalabilitepost(@RequestBody String order) {
        System.out.println("on est la");
        PrintWrite.write(order);
        return "ok";
    }
}
