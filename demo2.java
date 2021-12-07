import java.util.*;
class demo2
{
	 int a,b;
	public void add()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Number");
		a=sc.nextInt();
		b=sc.nextInt();
		int res=a+b;
		System.out.println("The add is="+res);
	}
	demo2(int a,int b,int c)
	{
		System.out.println("This is my construictor  :)");
	}
	 demo2(int a,int b)
	{
		int res=a-b;
		System.out.println("The substraction is ="
		+res);
		
	}
	public static void main(String args[])
	{
		demo2 obj=new demo2();
		demo2 obj1=new demo2(23,45);
		obj.add();
	}
}