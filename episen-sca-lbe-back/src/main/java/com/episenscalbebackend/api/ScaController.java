package com.episenscalbebackend.api;

import com.episenscalbebackend.util.PrintWrite;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScaController {

    private static Logger logger = Logger.getLogger(ScaController.class);

    @PostMapping("/add/order")
    public String scalabilitepost(@RequestBody String order) {
        logger.info(order);
        PrintWrite.write(order);
        return "ok";
    }
}
