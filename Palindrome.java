import java.util.*;
public class Palindrome{
	public static void main(String[] x)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int c=a;    // c is saved into a
		int b=0;   // b is reversed number
		int r;
		
		while(a!=0)
		{
			r=a%10;
			b=b*10+r;
			a/=10;
		}
		if(c==b)
		{
			System.out.println("a is palindrome number");
		}
		else
		{
			System.out.println("a is not palindrome number");
		}
	}
}
