import java.util.Scanner;
import java.util.*;

public class ED005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		S
		Stack<Character> st = new Stack<Character>();
		
		Scanner in = new Scanner(System.in);	
		System.out.println("Colocar número de opera");
		int n = in.nextInt();
		
		for (int i=0; i<n; i++) 
		{
			String s = in.next();

		}

		

	
		for (int i=0; i<s.length(); i++) 
		{
			char c = s.charAt(i);
			if (c =='[' || c == '(' || c =='{' ) 
			{

				LibStack.push(st, c);

			} else if (c == ']') {

				if (LibStack.isEmpty(st) || LibStack.pop(st) != '[' ) 
				{
					return false;
				}

			} else if (c == ')') {

				if ( LibStack.isEmpty(st) || LibStack.pop(st) != '(' ) 
				{
					return false;
				}
			}else if  ( c== '}') {

				if (LibStack.isEmpty(st) || LibStack.pop(st) != '{' ) 
				{
					return false;
				}
			}

		}
		return true;

	}
}


	}

}
