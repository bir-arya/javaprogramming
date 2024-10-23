package string;

public class FindIntergerInString {

	public static void main(String[] args) {
		
		String str = "Welcome To Class 12";
		
		String newStr = str.replaceAll("[^0-9]", "");
		
		System.out.println(newStr);
	}

}
