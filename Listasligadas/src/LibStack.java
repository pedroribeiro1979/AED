import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

class LibStack {
	public static <T extends Comparable<? super T>>
	boolean isEmpty(Stack<T> s) {
		return LibLinkedList.empty(s.elements);
	}
	public static <T extends Comparable<? super T>>
	int size(Stack<T> s) {
		return LibLinkedList.size(s.elements);
	}
	public static <T extends Comparable<? super T>>
	T pop(Stack<T> s) {
		T value = LibLinkedList.get(s.elements, 0);
		LibLinkedList.removeFirst(s.elements);
		return value;
	}
	public static <T extends Comparable<? super T>>
	void push(Stack<T> s, T value) {

		LibLinkedList.addFirst(s.elements, value);
	} 
	public static <T extends Comparable<? super T>>
	T top(Stack<T> s) {
		return LibLinkedList.get(s.elements, 0);
	}
	public static <T extends Comparable<? super T>>
	String toString(Stack<T> s) {
		return LibLinkedList.toString(s.elements);
	}

	static void reverse(Stack<Integer> s, int n) {

		int[] temp = new int[n];

			System.out.println(temp);

		for (int i=0; i<n; i++) 
		{
			int b;
			b = LibStack.pop(s) ;	  
			temp[i] = b;
			
		}
		
		for (int i=0; i<n; i++) 
		{
			LibStack.push(s, temp[i]);
		}

		System.out.println("Pilha Final:   " + LibStack.toString(s));


	}
}


