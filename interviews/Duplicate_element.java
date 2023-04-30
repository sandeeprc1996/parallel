package interviews;

public class Duplicate_element 
{
	public static void main(String[] args) {
		String [] arr= {"hi","hello","java","hi","java"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					System.out.println(arr[j]);
				}
			}
		}}}
//		for(int k=0;k<arr.length;k++)
//		{
//			if(arr[k]!="sandy")
//			{
//				System.out.println(arr[k]);
//			}
//		}
//	}
//}
