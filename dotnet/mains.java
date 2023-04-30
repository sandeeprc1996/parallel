package dotnet;

public class mains 
{
	public static void main(String[] args) 
	{
		//		int [] arr= {3,6,9,11,17,5,20};
		//		for(int i=0;i<arr.length-1;i++)
		//		{
		//			for(int j=1;j<=20;j++)
		//			{
		//				if(arr[i]!=j && arr[i+1]!=j && arr[i+2]!=j && arr[i+3]!=j && arr[i+4]!=j && arr[i+5]!=j && arr[i+6]!=j)
		//				{
		//					System.out.print(j+" ");
		//				}
		//			}break;
		//		}
		
		
		int [] inputarray= {3,6,4,9,7,15};
		for(int i=0;i<inputarray.length;i++)
		{
			for(int j=1;j<=20;j++)
			{
				if(inputarray[i]!=j && inputarray[i+1]!=j && inputarray[i+2]!=j && inputarray[i+3]!=j && inputarray[i+4]!=j && inputarray[i+5]!=j)
				{
					System.out.print(j+" ");

				}
			}          		

			break;
		}
		
//		String s="sandeepRCSaU";
//		String ss=s.toLowerCase();
//		int count=0;
//		for(int i=0; i<ss.length();i++)
//		{
//			char ch= ss.charAt(i);
//			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//			{
//				System.out.println(ch+" "+i);
//			}
//		}
		
		
		
		
	}
}