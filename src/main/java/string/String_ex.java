package string;

public class String_ex {
	public static void main(String[] args) {
//		String s = new String("abc");
//		String a = new String("abc");
//		System.out.println(a == s);
//		System.out.println(a.equals(a));
//		
//		String str = "prashant";
//		
//		StringBuffer sb = new StringBuffer("prashant");
//		
//		System.out.println(str == sb.toString());
		
		
		String s  = "Prashant";

		char [] stringArray = s.toCharArray();
		char [] reverseString = new char[stringArray.length];
		for(int i = 0; i< stringArray.length; i++ )
		{
			reverseString [i]= stringArray[stringArray.length-1-i ];

		}
		System.out.print(String.valueOf(reverseString));
		
	}
}
