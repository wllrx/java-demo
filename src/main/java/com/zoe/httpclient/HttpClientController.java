package com.zoe.httpclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zoe
 **/
@RestController
public class HttpClientController {

    @GetMapping("/test")
    public String test(@RequestBody String fromDate){
        System.out.println("this is ok");
        return "this is ok";
    }
}
