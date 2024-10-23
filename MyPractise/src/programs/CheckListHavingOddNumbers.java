package programs;

import java.util.ArrayList;
import java.util.List;

public class CheckListHavingOddNumbers {

	public static void main(String[] args) {
		boolean flag = false;
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(1);
		list.add(3);
		
		for(int i :list)
		{
			if(i%2==0)
			{
				flag=true;
			}
		}
		
		if(!flag)
		{
			System.out.println("list doesn't conatains odd number");
		}
		else
			System.out.println("list contains odd number");
	}
}
