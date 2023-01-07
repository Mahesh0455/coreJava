package Collection_List;

import java.util.ArrayList;

public class P9 {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		Employee e1=new Employee(101,"Raj");
		Employee e2=new Employee(102,"Ram");
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add("Mahesh");
		list.add(e1);
		list.add(e2);
		
		System.out.println(list.size());
		
		for(Object o:list) {
			System.out.print(o.toString()+" ");
		}
		
		
		
	}

}

class Employee{
	
	int empId;
	String empName;
	
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
		
	}
	
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public String getEmpName(){
		return this.empName;
		
	}
	
	public String toString() {
		return "Employee["+empId+"="+empName+"]";
	}
}
