package com.boot_files.LearnBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
 public class HomeController {
	
	 @Autowired
	ProductService service;
     
	@GetMapping("/getproduct")
	public List<Product> showProduct(){
 		return service.getProduct();
	}
	
	@PostMapping("/addproduct")
	public String addProduct(  Product prod) {
	    service.addPrdct(prod);
	    return "Product added";
	}

	 
	@GetMapping("/")
	 public String  home() {
		 return "This is home page";
	 }
	
	@GetMapping("/pathvar/{name}")
	public String m1(@PathVariable String name) {
		return "Hello im m1 by "+name;
	}
	
	@GetMapping("/reqpa")
	public String m2(@RequestParam String fname ) {
		return fname;
	}
	
	@RequestMapping(value="/def", method=RequestMethod.GET)
	public String defaults() {
        
		return "im default";
		}
    
	@PostMapping("/post")
	public String postName(@RequestParam String name) {
	    return "hi " + name;
	}
	   @GetMapping("/hello")
	    public String hello() {
	        return "Hello, World!";
	    }


}
