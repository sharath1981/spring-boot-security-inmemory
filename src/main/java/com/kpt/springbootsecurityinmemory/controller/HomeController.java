package com.kpt.springbootsecurityinmemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

   @GetMapping
   public String hello() {
       return "Welcome to Home...";
   }

   @GetMapping("user")
   public String user() {
       return "Hello User...";
   }

   @GetMapping("admin")
   public String admin() {
       return "Hello Admin...";
   }
       
}
