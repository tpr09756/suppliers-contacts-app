package com.project.suppliermanager.Controller;

import com.project.suppliermanager.Entity.Supplier;
import com.project.suppliermanager.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller("/index")
public class SupplierController {

    @Autowired
    private SupplierService service;


    @GetMapping("/suppliers")
    public String showAllSuppliers(Model model) {

        List<Supplier> listSupplier = service.getSuppliers();
        model.addAttribute("listSupplier", listSupplier);
        System.out.println(listSupplier);
        return "suppliers";
    }

    @GetMapping("/supplier/new/")
    public String newSupplierForm(Model model){
        model.addAttribute("supplier", new Supplier());
        model.addAttribute("pageTitle", "Add new supplier");
        return "supplier_form";
    }

    @PostMapping("/supplier/save")
    public String addSupplier(Supplier supplier, RedirectAttributes ra) {
        System.out.println(supplier);
        service.saveSupplier(supplier);
        ra.addFlashAttribute("Saved successfully");
        return "redirect:/suppliers";
    }

    @GetMapping("/supplier/edit/{id}")
    public String editFormSupplier(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        Supplier supplier = service.getSupplierById(id);
        model.addAttribute(supplier);
        model.addAttribute("pageTitle", "Edit supplier (Id: " + id + ")");

        return "supplier_form";
    }

    @GetMapping("/supplier/delete/{id}")
    public String deleteSupplier(@PathVariable("id") Integer id, RedirectAttributes ra) {
        service.deleteSupplier(id);
        return "redirect:/suppliers";
    }
}