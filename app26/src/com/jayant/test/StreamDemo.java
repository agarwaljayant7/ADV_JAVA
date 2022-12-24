package com.jayant.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class StreamDemo {

	public static void main(String[] args) {
	
			Employee e1 = new Employee(111, "aaa", 4500.12f);
			Employee e2 = new Employee(222, "bbb", 3987.12f);
			Employee e3 = new Employee(333, "cccccc", 3807.1398f);
			
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(e1);
			empList.add(e2);
			empList.add(e3);
	
			Consumer<Employee> consumer = employee -> System.out.println(employee.getEno());
			Function<Employee, Integer> function = employee1 -> {
				return employee1.getEno();
			};
			
			Predicate<Employee> p = e -> e.getEsal() < 4000.0f;
			
			
			for(Employee employee : empList) {
//				consumer.accept(employee);
				System.out.println(function.apply(employee));
				System.out.println(p.test(employee));
			}
	}

}
