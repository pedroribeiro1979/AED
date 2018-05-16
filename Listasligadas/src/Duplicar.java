
public class Duplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Character> w = new LinkedList<Character>();
		LibLinkedList.add(w, ('1'), 0);
	    LibLinkedList.add(w, ('2'), 1);
	    LibLinkedList.add(w, ('3'), 2);
	    LibLinkedList.add(w, ('4'), 3);
	   
		
		/*
		LinkedList<String> w = new LinkedList<String>();
	    LibLinkedList.add(w, ("a"), 0);
	    LibLinkedList.add(w, ("b"), 1);
	    LibLinkedList.add(w, ("c"), 2);
	    LibLinkedList.add(w, ("d"), 3);
	   */

	   
	//    LinkedList<String> w = new LinkedList<String>();
	    
	    System.out.println("Lista origianl: " + LibLinkedList.toString(w));
	    
	    LibLinkedList.duplicate(w);			
		
	}

}
