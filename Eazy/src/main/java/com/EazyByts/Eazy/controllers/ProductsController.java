package com.EazyByts.Eazy.controllers;




import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.EazyByts.Eazy.models.Product;
import com.EazyByts.Eazy.models.ProductDto;
import com.EazyByts.Eazy.services.ProductRepository;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
@RequestMapping("/customers")

public class ProductsController {

    @Autowired
    private ProductRepository repo;

    @GetMapping({"","/"})
    public String showProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("customers", products);
        return "customers/index";
    }


    @GetMapping("/create")
    public String showCreatePage(Model model) {
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto", productDto);
        return "customers/CreateProduct";
    }

    @PostMapping("/create")
    public String createProduct(
        @Valid @ModelAttribute ProductDto productDto,
        BindingResult result
    ) {
    if (result.hasErrors()) {
        return "customers/CreateProduct";
        }

        
    



        Product customer = new Product();
        customer.setName(productDto.getName());
        customer.setEmail(productDto.getEmail());
        customer.setPhone(productDto.getPhone());
        customer.setAddress(productDto.getAddress());
        

        repo.save(customer);

        return "redirect:/customers";
    }

   @GetMapping("/delete")
   public String deleteCustomer(
    @RequestParam int id
   ) {

    try{
        Product product = repo.findById(id).get();
        repo.delete(product);
    }
    catch(Exception ex) {
        System.out.println("Exception: " + ex.getMessage());
    }

    return "redirect:/customers";
   }
   

}
