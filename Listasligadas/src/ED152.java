import java.util.Scanner;

public class ED152 {

    
    public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);	
	int n = in.nextInt();
	for (int i=0; i<n; i++) 
	{
	    String s = in.next();

	    System.out.println( s + ": " + LibStack.balanced(s));
	}
	
    }
}

