package com.masaiQ1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		HashMap<String,Employee> hm = new HashMap<>();
		hm.put("Sohan",new Employee(10,"Ganesh",950));
		hm.put("Gagdish",new Employee(12,"Surya",850));
		hm.put("Malyashree",new Employee(15,"Venkat",920));
		hm.put("Venkatnaryan",new Employee(16,"Dinesh",910));
		hm.put("Urteshwandani",new Employee(18,"Srinu",880));
		//getting all the state name:
		Set<String> states= hm.keySet();
		for(String state:states){
		System.out.println(state);
		}
		//Getting all the Student as List object.
		Collection<Employee> cols = hm.values();
		List<Employee> emp = new ArrayList<>(cols);
		//printing all the students from the List
		for(Employee employee:emp){
		System.out.println("empId :"+employee.getEmpId());
		System.out.println("Name :"+employee.getName());
		System.out.println("salary :"+employee.getSalary());
		System.out.println("=========================");
		}
		//printing state wise students details:
		Set<Map.Entry<String,Employee>> set = hm.entrySet();
		for(Map.Entry<String,Employee> me: set) {
		System.out.println(" :" + me.getKey());
		System.out.println("*********************************");
		Employee student = me.getValue();
		System.out.println("empId :" + student.getEmpId());
		System.out.println("Name :" + student.getName());
		System.out.println("salary :" + student.getSalary());
		}

	}
}
