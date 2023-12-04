package Fibonocci;

public class Fibonocci {
	public static void fibonocci(int x)
	{
	int fb1=0,fb2=1,fb3=0;
	if(x==0)
	{
		System.out.println("fb1");
	}
	else if(x==1)
	{
		System.out.println("fb2");
	}
	else
	{
		System.out.print(fb1+" "+fb2+" ");
		for(int i=2;i<=x;i++)
		{
			fb3=fb1+fb2;
			System.out.print(fb3+" ");
			fb1=fb2;
			fb2=fb3;
			
		}
	}
		
	}

}
