package shifana;
import java.util.Scanner;

public class searchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("enter number of elements:");
int n=sc.nextInt();
int[] arr= new int[n];
System.out.println("enter the elements:");
for(int i =0;i<n;i++) {
	arr[i]=sc.nextInt();
}
System.out.print("enter element to search:");
int key=sc.nextInt();
boolean found=false;
for (int i=0;i<n;i++) {
	if (arr[i]==key) {
		System.out.println("element found at position:"+(i+1));
		found=true;
		break;
	}
}
if(!found) {
	System.out.println("element not found.");
}
sc.close();
	}

}
