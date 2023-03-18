package com.mvc.springmvcprojectdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(path = "/imperator",method = RequestMethod.GET)
    public void getImperatorPage(){
        System.out.println("Odpalamy stronkę z zarządzanymi flotami imperium");
    }
}
