public class Exec_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 30;
		
		
		//LibStack a = new LibStack();
		Stack<Integer> x = new Stack<>();
		
		while (n > 0) {
			System.out.print(n % 2);
				LibStack.push(x,(n % 2));
			n = n / 2;
		}
		
		System.out.println(LibStack.toString(x));
	

		
		
	}


}