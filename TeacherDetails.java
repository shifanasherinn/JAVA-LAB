package shifana;
import java.util.Scanner;
class employee{
	int empId;
	String name;
    double salary;
    String address;
  
    employee(int empId,String name,double salary,String address) {
    	this.empId=empId;
    	this.name=name;
    	this.salary=salary;
    	this.address=address;
    }
}
class Teacher extends employee{
	String department;
	String subject;
	
	
	Teacher(int empId,String name,double salary,String address,String department,String subject) {
		super(empId,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	void display()
	{
		System.out.println("employee ID:" + empId);
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);
		System.out.println("address" + address);
		System.out.println("department:" + department);
		System.out.println("subject:" + subject );
		System.out.println("---------------------");
	}
}
public class TeacherDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.print("enter number of teachers:");
 int n= sc.nextInt();	
 sc.nextLine();
 Teacher[]t=new Teacher[n];
 for(int i=0;i<n;i++) {
	 System.out.println("\nenter details of teacher"+(i+1));
	 System.out.println("employee ID:");
	  int id =sc.nextInt();
	  sc.nextLine();
	  
	  System.out.print("name:");
	  String name=sc.nextLine();
	  
	  System.out.print("salary:");
	  double salary=sc.nextDouble();
	  sc.nextLine();

	  System.out.print("addres:");
	  String address=sc.nextLine();
	  System.out.print("department:");
	  String dept=sc.nextLine();
	  System.out.print("subject:");
	  String subject=sc.nextLine();
	  t[i]=new Teacher(id,name,salary,address,dept,subject);
 }
	 System.out.println("\nTeacher Details:");
	 for(int i=0;i<n;i++) {
		 t[i].display();
	 }
	 sc.close();
 }

}
