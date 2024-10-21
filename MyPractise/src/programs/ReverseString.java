package programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java";

		//using while Loop
		
	/*	for(int i=s.length(); i>0; --i)
		{
			
			System.out.print(s.charAt(i-1));
			
		}
	*/	

		//Using while loop
/*		int i= s.length();
		while(i>0)
		{
			System.out.print(s.charAt(i-1));
			i--;
		}
		
*/
		char[] stgArray = str.toCharArray();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.println(stgArray[i]);
		}
		
		//Using 
		
	}

}
