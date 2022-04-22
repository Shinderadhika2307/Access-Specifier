package pkg1;

public class HR {

	public static void main(String[] args) {
	Employee E=new Employee();
	System.out.println("Employee id is:" +E.emp_id); //possible because it is protected
	System.out.println("Employee Name is:"+E.emp_name);//possible because it is public
	System.out.println("salary is:" +E.salary); //possible because it is default
	
	// E.empWork(); //not possible because empWork is private

	}

}
