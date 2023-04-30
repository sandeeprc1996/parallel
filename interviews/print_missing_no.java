package interviews;

public class print_missing_no 
{
	public static void main(String[] args) {
		int [] no= {1,2,3,5,6,7,8,9,10};
		int sum=0;int sum1=0;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}System.out.println(sum);
		for(int j=1;j<=10;j++)
		{
			sum1=sum1+j;
		}System.out.println(sum1);
		System.out.println("find missing no :"+(sum1-sum)); //no 4 is missing
	}
}
