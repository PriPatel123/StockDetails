package com.stocks.stocks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class StocksController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@Autowired
	com.stocks.stocks.StocksRepository  stocksRepository;
	 @CrossOrigin(origins = "http://localhost:4200")
	  @GetMapping("/stocks") 
	  @ResponseBody
	  public List<com.stocks.stocks.Stock>  stock() { 
		  Iterable it  = stocksRepository.findAll();
		
	  List list = org.springframework.data.util.Streamable.of(it).toList();
	  
	  return list;	}
	  
	 
}
