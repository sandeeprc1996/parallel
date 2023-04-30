package interviews;

import java.util.HashMap;
import java.util.Map;

public class count_no_of_duplicates 
{
	public static void main(String[] args) {
		String s="hi sandy wru sandy come sandy";
//		split function
		String[] ss = s.split("");
//		create hashmap
		Map<String,Integer> sm=new HashMap<>();
//		foreach loop
		for(String a:ss)
		{
//			check condition present or not
			if(sm.containsKey(a))
			{
				sm.put(a, sm.get(a)+1);
			}
			else
			{
				sm.put(a, 1);
			}
		}
//		extract all the keys in map
	}
}
