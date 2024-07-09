package string;

public class immutableString {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		
		System.out.println(s1 == s3);
		s3 = s1 +"j2ee";
		System.out.println(s1 == s3);
		
		if(s1.contains(s2)) {
			System.out.println(true);
		}
		
	}	
}
