
public class Concatnar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		LinkedList<Character> a = new LinkedList<Character>();
		LibLinkedList.add(a, ('1'), 0);
		LibLinkedList.add(a, ('2'), 1);
		LibLinkedList.add(a, ('3'), 2);
		LibLinkedList.add(a, ('4'), 3);


		LinkedList<Character> b = new LinkedList<Character>();
		LibLinkedList.add(b, ('5'), 0);
		LibLinkedList.add(b, ('6'), 1);
		LibLinkedList.add(b, ('7'), 2);


		/*
		LinkedList<String> a = new LinkedList<String>();  
		LibLinkedList.add(a, ("Estrutura"), 0);


		LinkedList<String> b = new LinkedList<String>();
		LibLinkedList.add(b, ("de"), 0);
		LibLinkedList.add(b, ("Dados"), 1);
		*/
		
		
		/*
		LinkedList<String> a = new LinkedList<String>();
		LibLinkedList.add(a, ("-2"), 0);
		LibLinkedList.add(a, ("-3"), 1);
		LibLinkedList.add(a, ("0"),  2);
		
		LinkedList<String> b = new LinkedList<String>();  
		
		*/


		
//		LinkedList<String> a = new LinkedList<String>();  
//		LibLinkedList.add(a, (""), 0);
//		
//		LinkedList<String> b = new LinkedList<String>();
//		LibLinkedList.add(b, ("-2"), 0);
//		LibLinkedList.add(b, ("-3"), 1);
//		LibLinkedList.add(b, ("0"),  2);
		
		
		
	//	LinkedList<String> a = new LinkedList<String>();  

		
	//	LinkedList<String> b = new LinkedList<String>();

		

		LibLinkedList.concatenate(a, b);
	}

}
