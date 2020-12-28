import CIE.*;
import SEE.*;
import java.util.Scanner;

class Program6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of students : ");
		int n = sc.nextInt();
		Internals in[] = new Internals[n];
		Externals ext[] = new Externals[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("Student "+(i+1));
			in[i] = new Internals();
			ext[i] = new Externals();
			in[i].getdata();
			ext[i].getdata();
		}
		System.out.println("Student Details are as follow:-");
		for(int i=0;i<n;i++) 
		{
			System.out.println("Student "+(i+1));
			in[i].printdata();
			ext[i].printdata();
			System.out.println("Total marks : ");
			for(int j=0;j<5;j++)
			System.out.println("Subject "+(j+1)+" : "+( in[i].cie_marks[j] + ext[i].see_marks[j] ));
		}
		
	}
}