package com.project.suppliermanager.Controller;


import com.project.suppliermanager.Entity.Supplier;
import com.project.suppliermanager.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("/index")
public class MainController {

    @Autowired
    private SupplierService service;

    @GetMapping("/suppliers")
    public String showAllSuppliers(Model model) {

        List<Supplier> listSupplier = service.getSuppliers();
        model.addAttribute("listSupplier", listSupplier);
        System.out.println(listSupplier);
        return "suppliers";
    }
}
