package pkg1;

public class Employee {
protected static int emp_id=001;
protected long contact=3425676578L;
	public String emp_name="Mahee Deshmukh";
	int salary=30000;

	public static void main(String[] args) {
		Employee E=new Employee();
				System.out.println("Employee id is:" +E.emp_id);
				System.out.println("Employee Name is:"+E.emp_name);
				System.out.println("salary is:" +E.salary);
				System.out.println("******Employee work profile*****");
				E.empWork();

	}
	private void empWork()
	{
		System.out.println("Working as manual and automation tester for Amazon project");
		System.out.println("Day to Day work is...");
		System.out.println("Attainding  meetings, writing test cases, test scripts, executing test cases");
	}
	
	
	

}
