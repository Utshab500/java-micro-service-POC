/**
 * 
 */
package com.first.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Utshab Saha
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ResourceController {
	
	@GetMapping(value = "/first")
    public String index(){
        return "Hello I am first service";
    }

}
