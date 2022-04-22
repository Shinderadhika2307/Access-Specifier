package pkg2;
import pkg1.Employee;
public class Colleagues extends Employee
{

	public static void main(String[] args) {
		Employee E=new Employee();
		System.out.println("Employee id is:" +E.emp_id); //possible because it is protected
		System.out.println("Employee Name is:"+E.emp_name); //possible because it is public
		//System.out.println("salary is:" +E.salary);	//not possible because of default
		
		Colleagues kk=new Colleagues();
System.out.println(kk.contact);
	}

}
