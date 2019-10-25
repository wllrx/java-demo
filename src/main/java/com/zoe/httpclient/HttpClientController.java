package com.zoe.httpclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zoe
 **/
@RestController
public class HttpClientController {

    @GetMapping("test")
    public void test(){
        System.out.println("this is ok");
    }
}
