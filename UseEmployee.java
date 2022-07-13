package trainingday19COLLECTIONSstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String args[]) {
		Employee emp1=new Employee(101,10000,"Married");
		Employee emp2=new Employee(102,30000,"Single");
		Employee emp3=new Employee(103,40000,"Single");
		ArrayList<Employee> emps=new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		List<Employee> lt=emps.stream().filter(x->x.getSalary()<15000).collect(Collectors.toList());
		lt.forEach(lists->System.out.println(lists));
		
	}

}
