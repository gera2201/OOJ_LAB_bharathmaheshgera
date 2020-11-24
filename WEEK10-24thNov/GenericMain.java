class Generic<A, B, C>
{
	A ob1;
	B ob2;
	C ob3;
	Generic(A o1, B o2, C o3)
	{
		ob1 = o1;
		ob2 = o2;
		ob3 = o3;
	}
	void Display()
	{
		System.out.println("A is " + ob1.getClass().getName());
		System.out.println("B is " + ob2.getClass().getName());
		System.out.println("C is " + ob3.getClass().getName());
	}
	A func1()
	{
		return ob1;
	}
	B func2()
	{
		return ob2;
	}
	C func3()
	{
		return ob3;
	}
}

class GenericMain
{
	public static void main(String args[])
	{
		Generic<Integer, String, Double> mainobj = new Generic<Integer, String, Double>(47, "qwerty", 1500.99);
		mainobj.Display();
		int a = mainobj.func1();
		System.out.println("Value of Integer: " + a);
		String b = mainobj.func2();
		System.out.println("String: " + b);
		double c = mainobj.func3();
		System.out.println("Value od Double: " + c);
    	}
}