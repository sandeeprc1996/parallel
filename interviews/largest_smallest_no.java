package interviews;

public class largest_smallest_no 
{
	public static void main(String[] args) {
		int [] no= {10,5,3,66,9,77};
		int largest=no[0];
		int smallest=no[0];
		for(int i=0;i<no.length;i++)
		{
			if(no[i]>largest)
			{
				largest=no[i];
			}
			else if(no[i]<smallest)
			{
				smallest=no[i];
			}}
			System.out.println(largest+" "+ smallest);
		}
	}

