package dotnet;

public class sumation 
{
	public static void main(String[] args) {
		int no=153;
		int sum=0;
		while(no!=0)
		{
			int rem= no%10;
			sum=sum+rem;
			no=no/10;
		}
		if(sum%2==0)
		{
			System.out.println(sum+" no is even no");
		}else
		{
			System.out.println(sum+" no is Odd");
		}
	}
}
