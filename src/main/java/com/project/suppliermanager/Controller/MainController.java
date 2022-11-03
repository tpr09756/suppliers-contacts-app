package com.project.suppliermanager.Controller;


import com.project.suppliermanager.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/index")
public class MainController {

    @Autowired
    private SupplierService service;

    @GetMapping("/index")
    public String homePage(){
        return "index";
    };
}
