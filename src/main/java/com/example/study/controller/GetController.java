package com.example.study.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //Localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //Localhost:8080/api/getMethod
    public String getRequest() {

        return "Hi getMethod";
    }

    @GetMapping("/getParameter") // Localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam String password){
        String password;
        System.out.println("id : "+id);
        System.out.println("password: "+password);

        return id+password;
    }
}
