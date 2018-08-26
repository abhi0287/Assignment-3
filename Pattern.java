import java.util.*;
public class Pattern{
	public static void main(String[] x)
	{
		int i,j,n;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
                     System.out.println();
		}
	}
}
