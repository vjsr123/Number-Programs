package productoddnumbers;

public class ProductOdd {
	public static void oddnproduct(int x)
	{
		int res=1;
		int count =1;
		for(int i=1;i<=x;i++)
		{
			if(i%2!=0)
			{
				res=res*count;
				count+=2;
			}
		}
		System.out.println(res);
	}

}
