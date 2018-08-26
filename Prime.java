import java.util.*;
public class Prime{
	public static void main(String[] x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int i;
		int count=0;
		for(i=2;i<=a/2;i++)
		{
			if(a%i==0)
			count++;
		}
		if(count==2)
		{
			System.out.println("this is  a prime no");

		}
		else
		{
			System.out.println("this is not a prime no");
		}
	}
}
		
		
