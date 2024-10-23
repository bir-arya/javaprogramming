package string;

public class CheckVowel {

	public static void main(String[] args) {
		
		String str = "Welcome";
		
		System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
	}

}
