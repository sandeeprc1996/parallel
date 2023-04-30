package dotnet;

public class recarse 
{
	static void disp(int i) throws InterruptedException
	{
		if(i<=100)
		{
		System.out.println(i);
//		Thread.sleep(2000);
		i++;
		disp(i);
	}
	}
	public static void main(String[] args) throws InterruptedException {
		disp(10);
	}

}
