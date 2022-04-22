package pkg2;

import pkg1.*;

public class Employee {
		 static int emp_id=9;
		 long contact=342578L;
			public String emp_name="Radha";
			int salary=3000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pkg1.Employee E=new pkg1.Employee(); //when class name is same we have to include package name
		System.out.println(E.emp_name);

	}

}
