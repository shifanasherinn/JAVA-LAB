package shifana;
import java.util.Scanner;
public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string:");
		String str= sc.nextLine();
		System.out.println("Length:"+str.length());
		System.out.println("Uppercase:"+str.toUpperCase());
		System.out.println("Lowercase:"+str.toLowerCase());
		String reversed="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reversed+=str.charAt(i);
		}
		System.out.println("Reversed String:"+ reversed);
				System.out.print("enter another string to concatenate:");
				String str2=sc.nextLine();
				System.out.println("concatenated String:"+ str.concat(str2));
				if(str.equals(str2))
				{
					System.out.println("both strings are equal");
				}
				else
				{
					System.out.println(" strings are not equal");
				}
				sc.close();
				}

}
