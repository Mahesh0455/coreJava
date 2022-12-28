package Collection_Set;

import java.util.*;

public class Employee implements Comparable {

	String name;
	int emp_id;

	Employee(String name, int emp_id) {
		this.name = name;
		this.emp_id = emp_id;
	}

	@Override
	public String toString() {

		return name + "-" + emp_id;
	}

	@Override
	public int compareTo(Object obj) {
		Employee emp=(Employee)obj;
		int id1=this.emp_id;
		int id2=emp.emp_id;
		
		if(id1>id2) {
			return 1;
		}else if(id1<id2) {
			return -1;
		}else {
			return 0;
		}

		
	}
	
	public static void main(String[] args) {

		Employee e1 = new Employee("Mahesh", 101);
		Employee e2 = new Employee("Shubham", 96);
		Employee e3 = new Employee("Karan", 107);
		Employee e4 = new Employee("Divya", 104);
		Employee e5 = new Employee("Kavya", 90);
		
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);

	}

}

