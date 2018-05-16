
import java.util.Scanner;
class ED154 {
	
	
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
		Queue<Integer> a = new Queue<Integer>();
		int na = stdin.nextInt();
		for (int i=0; i<na; i++) LibQueue.add(a, stdin.nextInt());
		System.out.println("a = " + LibQueue.toString(a));
		Queue<Integer> b = new Queue<Integer>();
		int nb = stdin.nextInt();
		for (int i=0; i<nb; i++) LibQueue.add(b, stdin.nextInt());
		System.out.println("b = " + LibQueue.toString(b));

		Queue<Integer> q = LibQueue.merge(a, b); 
		System.out.println("merge = " + LibQueue.toString(q));
	}
}

