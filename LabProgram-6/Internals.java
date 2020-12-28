package CIE;
import java.util.Scanner;


public class Internals extends Student
{
	public int cie_marks[] = new int[5];
	public void getdata() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the following information : \n");
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("USN : ");
		USN = sc.nextLine();
		System.out.print("Semester : ");
		sem = sc.nextInt();
		System.out.println("Enter the marks scored in CIE : ");
		for(int i=0;i<5;i++) 
		{
			System.out.print("Subject "+(i+1)+ " : ");
			cie_marks[i] = sc.nextInt();
		}
	}

	public void printdata() 
	{
		System.out.println("Name : "+name);
		System.out.println("USN : "+USN);
		System.out.println("Semester : "+sem);
		System.out.println("CIE Marks : ");
		for(int i=0;i<5;i++)
		 {
			System.out.println("Subject "+(i+1)+ " : "+cie_marks[i]);
		}
	}
}