import java.util.Scanner;

class ED153 {

    
    public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);

	Queue<String> q = new Queue<String>();
	Queue<String> a = new Queue<String>();
	Queue<String> b = new Queue<String>();
	int n = stdin.nextInt();
	for (int i=0; i<2*n; i++) {
	    String s = stdin.next();
	    LibQueue.add(q, s);
	}

	System.out.println("Inicio:");
	System.out.println("q: " + LibQueue.toString(q));
	System.out.println("a: " + LibQueue.toString(a));
	System.out.println("b: " + LibQueue.toString(b));
	LibQueue.process(q, a, b);
	System.out.println("-------------------------------");
	System.out.println("Final:");
	System.out.println("q: " + LibQueue.toString(q));
	System.out.println("a: " + LibQueue.toString(a));
	System.out.println("b: " + LibQueue.toString(b));
}
    
    
    }
