package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionsMain {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		System.out.println(nameList.size());
		nameList.add("Anjali");
		nameList.add("Ashish");
		nameList.add("janhavi");
		nameList.add("kavita");
		nameList.add("yash");
		nameList.add("rohit");
		System.out.println(nameList);
		System.out.println(nameList.size());

		nameList.remove(2);
		System.out.println("After remove");
		System.out.println(nameList);
		System.out.println(nameList.size());

		System.out.println();
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee(101, "kavita", 1000);
		Employee employee2 = new Employee(101, "janhavi", 1000);
		Employee employee3 = new Employee(101, "yash", 1000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		for (Employee e : employeeList) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println(employeeList);

		System.out.println();
		Set<String> nameSet = new HashSet<>();
		nameSet.add("Yash");
		nameSet.add("vineet");
		nameSet.add("Gagan");
		nameSet.add("vineet");
		nameSet.add("Yash");
		nameSet.add(null);
		nameSet.add(null);
		System.out.println(nameSet);

		System.out.println();
		SortedSet<String> sortedNameSet = new TreeSet<>();
		sortedNameSet.add("yash");
		sortedNameSet.add("vineet");
		sortedNameSet.add("Gagan");
		sortedNameSet.add("vineet");
		sortedNameSet.add("yash");

		System.out.println(sortedNameSet);

		System.out.println();
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101, "rohit");
		employeeMap.put(102, "suraj");
		employeeMap.put(103, "janhavi");
		employeeMap.put(104, "yash");
		System.out.println(employeeMap);
		

		Integer i = 50;
		System.out.println(i.hashCode());
		
		SortedMap<Integer,String> employeeSortedMap = new TreeMap<>();
		employeeSortedMap.put(1, "test 1");
		employeeSortedMap.put(10, "test 10");
		employeeSortedMap.put(4, "test 4");
		employeeSortedMap.put(6, "test 6");
		
		System.out.println(employeeSortedMap);

	}

}
