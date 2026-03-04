package shifana;
import java.util.Scanner;
class Employee {
	int eNo;
	String eName;
	double eSalary;
	void read(Scanner sc)
	{
		System.out.print("enter Employee Number:");
		eNo=sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter Employee Name:");
		eName=sc.nextLine();

		
		System.out.print("enter employee salary:");
		eSalary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("employee number:" + eNo);
		System.out.println("employee name:" + eName);
		System.out.println("employee salary:" + eSalary);


	}
	
}

public class EmployeeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       System.out.print("enter number of employees:");
       int n=sc.nextInt();
       Employee[]emp=new Employee[n];
       for(int i=0;i<n;i++) {
    	   emp[i]=new Employee();
    	   System.out.println("\nEnter details of employee:"+(i+1));
    	   emp[i].read(sc);
       }
       System.out.println("\nEnter employee number to search:");
       int searchNo=sc.nextInt();
       
       boolean found = false;
       for(int i=0;i<n;i++) {
    	  if(emp[i].eNo == searchNo) {

    		  System.out.println("\nemployee found:");
    		  emp[i].display();
    		  found=true;
    		  break;
    	  }
       }
       if(!found) {
    	   System.out.println("employee not found.");
       }
       sc.close();

}
    	   
    	   
       }
	