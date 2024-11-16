package com.employee1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee1.DAO.Employee1DAO;
import com.employee1.entity.Employee1;

@Service
public class Employee1Service {
	@Autowired
	Employee1DAO ed;

	public String posts(Employee1 e) {
		
		return ed.posts(e);
	}



	public List<Employee1> gets() {
		// TODO Auto-generated method stub
		return ed.gets();
	}



	public Employee1 geti(int a) {
		// TODO Auto-generated method stub
		return ed.geti(a);
	}

	public String putsid(int x, Employee1 ee) {
		// TODO Auto-generated method stub
		return ed.putsid(x,ee);
	}



	public String deletes(int y) {
		return ed.deletes(y);
	}


}



	





