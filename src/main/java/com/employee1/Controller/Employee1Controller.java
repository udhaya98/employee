package com.employee1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee1.Service.Employee1Service;
import com.employee1.entity.Employee1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@CrossOrigin("*")
@RestController
@RequestMapping("/employee")

public class Employee1Controller {
@Autowired
Employee1Service es;
@PostMapping("/posts")
public String posts(@RequestBody Employee1 e) {
    
    return  es.posts(e);
}
@GetMapping("/gets")
public List<Employee1> gets() {
    return es.gets();
}
@GetMapping("/getsid/{a}")
public Employee1 geti(@PathVariable int a) {
    return es.geti(a);
}
@PutMapping("/putid/{x}")
public String putsid(@PathVariable int x,@RequestBody Employee1 ee) {
	return es.putsid(x,ee);
}
   
@DeleteMapping("deletes/{y}")
public String deletes(@PathVariable int y) {
	return es.deletes(y);
}


}
