package interviews;

public class remove_junks 
{
	public static void main(String[] args) {
		String s="sandy!@#$%^&*()_+sand1234SS";
		String ss = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(ss);
	}
}
