package com.example.ex2.controller;


/**
 * Created by Thomas Wang on 7/18/2022.
 */
@RestController
public class Ex2Controller {
    @GetMapping("/ex2")
    public String ex2(){
        return "Hello Jenkins!";
    }
}
