package string;

public class ParsingString {

	public static void main(String[] args) {
		
		String s = "123";
		
		int a = Integer.parseInt(s);
		
		System.out.println(a);	
		
		double d = Double.parseDouble(s);
		
		long l = Long.parseLong(s);
		
		System.out.println(d);
		System.out.println(l);
		
		
		int a1 = 10;
		
		String s1 = String.valueOf(a);
		System.out.println(a1);
	}

}
