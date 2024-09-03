package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @RequestMapping(value={"/path/{username}/{password}","/path/{password}"},method= RequestMethod.POST)
    public String path(@PathVariable(value="username",required = false) String username,@PathVariable("password") String password){

        return "Hello"+username + "  "+password;
    }
    @RequestMapping(value="/param")
    public String param(@RequestParam(value="username") String username,@RequestParam("password") String password){

    }

}
