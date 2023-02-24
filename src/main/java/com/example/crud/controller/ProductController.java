package com.example.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.Product;
import com.example.crud.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return productService.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
		
		return productService.saveProducts(products);
		
	}
	
	@GetMapping("/productById/{id}")
	public Product findProduct(@PathVariable int id) {
		
		return productService.getProductById(id);
		
	}
	
	@GetMapping("/products")
	public List<Product> findProducts() {
		
		return productService.getProducts();
		
	}
	
	@GetMapping("/productByName/{name}")
	public Product findProductByName(@PathVariable String name) {
		
		return productService.getProductByName(name);
		
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		
		return productService.updateProduct(product);
		
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id);
	}
			
	
	
	

}
