class Threadfunc implements Runnable
{ 	
	Thread t;
	String a;
	int b;
   	Threadfunc(String s,int n)
   	{
	   a=s;
	   b=n;
       	   t=new Thread(this, "Thread");
	   t.start();
   }
   
  public void run()
   {
	   try
	   {
		   for(int i=3;i>0;i--)
		   {
			 System.out.println(a);
			 Thread.sleep(b);
		   }
	   }
	   catch(InterruptedException ie)
	   {
		   System.out.println("Thread Interrupted");
	   }
   }
}

class Threadmain1
{
	public static void main(String args[])
	{
		Threadfunc n=new Threadfunc("BMS college of engineering",10000);
		Threadfunc m=new Threadfunc("CSE",2000);
	}
}