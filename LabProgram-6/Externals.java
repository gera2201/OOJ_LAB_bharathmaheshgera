package SEE;
import CIE.*;
import java.util.Scanner;

public class Externals extends Student
{
	public int see_marks[] = new int[5];
	public void getdata() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter SEE marks of the student : ");
		for(int i=0;i<5;i++) 
		{
			System.out.print("Subject "+(i+1)+" : ");
			see_marks[i] = sc.nextInt();
		}
	}
	public void printdata()
	{
		System.out.println("SEE marks : ");
		for(int i=0;i<5;i++) 
		{
			System.out.println("Subject "+(i+1)+" : "+see_marks[i]);
		}
	}
}