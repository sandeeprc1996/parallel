package interviews;

public class manipulation 
{
	public static void main(String[] args) {
		String s="sandeep test engg";
		
//		length of element
		System.out.println(s.length());
		
//		check for 5th index
		System.out.println(s.charAt(5));
		
//		index of t
		System.out.println(s.indexOf('t'));
		
//		same string fretch
		System.out.println(s.indexOf('s', 5));
		
//		2nd s
		System.out.println(s.indexOf('s',s.indexOf('s')+1));
		
//		substring
		System.out.println(s.substring(1, 5));
		
//		
	}
}
