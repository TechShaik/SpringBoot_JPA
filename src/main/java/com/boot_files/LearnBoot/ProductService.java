package com.boot_files.LearnBoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
 public class ProductService {
	
	@Autowired
	repo rep;
	
    
       public List<Product> getProduct() {
    	   return rep.findAll();
       }
       
       public Product addPrdct( Product prd) {
    	 return rep.save(prd);
    	 
       }
       
       public void delPrdct(int id) {
    	   rep.deleteById(id);
       }
       
       
}
