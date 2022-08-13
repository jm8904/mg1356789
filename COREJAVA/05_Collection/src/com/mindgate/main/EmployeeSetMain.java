package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeSetMain {


		public static void main(String[] args) {
			Set<Employee> empSet  =  new HashSet<>();
			Employee e1 = new Employee(1, "x", 100);
			//System.out.println("e1 ::" + e1.hashCode());
			Employee e2 = new Employee(1, "x", 100);
			//System.out.println("e2 ::" + e2.hashCode());
			
			empSet.add(e1);
			empSet.add(e1);
			
			for (Employee employee : empSet) {
				System.out.println(employee);
			}
			
	}

}
