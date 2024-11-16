package com.employee1.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee1.Respository.Employee1Repository;
import com.employee1.entity.Employee1;

@Repository
public class Employee1DAO {
	@Autowired
	Employee1Repository erpo;

	public String posts(Employee1 e) {
		erpo.save(e);
		return "Posted Successfully";
	}


	public List<Employee1> gets() {
		return erpo.findAll();
	}


	public Employee1 geti(int a) {
		// TODO Auto-generated method stub
		return erpo.findById(a).get();
	
	
	}
	public String putsid(int x, Employee1 ee) {
		erpo.save(ee);
		return "Success";
		
	}
	public String deletes(int y) {
		erpo.deleteById(y);
		return "Delete";
	}


	


	

}
