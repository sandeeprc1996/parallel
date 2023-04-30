package interviews;

public class find_missing_no_print_remaing_no 
{
	public static void main(String[] args) {
		int [] no= {1,5,6,2,9};
		for(int i=0;i<no.length;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(no[i]!=j && no[i+1]!=j && no[i+2]!=j && no[i+3]!=j &&no[i+4]!=j )
				{
					System.out.println(j);
				} 
			}break;
		}
}}