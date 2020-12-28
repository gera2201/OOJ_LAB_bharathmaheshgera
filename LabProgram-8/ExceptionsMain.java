import java.util.Scanner;
class WrongAge extends Exception 
{
    int age;
    WrongAge(int x)
    {
        age = x;
    }
    public String toString() 
	{
        	return "AGE OF SON=" + age + " IS ENTERED INCORRECTLY";
 	}
}

class father 
{
    int a;
    father(int x) 
    {
        a = x;
    }
}

class son extends father 
{
    int age;
    son(int f, int s) 
    {
        super(f);
        age = s;
    }
    void compute() throws WrongAge 
    {
        if (age >= a) 
	{
            throw new WrongAge(age);
        } 
	else 
	{
            System.out.println("THE AGES ARE ENTERED CORECTLY");
            System.out.println("FATHER'S AGE=" + a + "\t" + "SON'S AGE=" + age);
        }
    }

}

class ExceptionsMain 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FATHER'S AGE:");
        int f = sc.nextInt();
        System.out.println("ENTER SON'S AGE:");
        int s = sc.nextInt();
        son s1 = new son(f, s);
        try 
	{
            s1.compute();
        } 
	catch (WrongAge x) 
	{
            System.out.println(x);
        }
    }
}