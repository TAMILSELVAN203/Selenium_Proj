package org.emp;

public class Employee {

	public void empId() {
		System.out.println("this is the EmpId ");
	}

	public void empId(int z) {
		System.out.println("EmpId in int value is " + z);
	}

	public void empId(float z) {
		System.out.println("EmpId in float value is" + z);
	}

	public void empId(double z) {
		System.out.println("EmpId in double value is " + z);
	}

	public void empId(char z) {
		System.out.println("EmpId in char value is " + z);
	}

	public void empId(String z) {
		System.out.println("EmpId in string value is " + z);
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.empId();
		obj.empId(654);
		obj.empId(654.0f);
		obj.empId(24428244.4);
		obj.empId('T');
		obj.empId("Tamil");
	}

}
