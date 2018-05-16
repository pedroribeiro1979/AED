

public class ED149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> w = new LinkedList<Integer>();
		LibLinkedList.add(w, 1, 0);
	    LibLinkedList.add(w, 2, 1);
	    LibLinkedList.add(w, 1, 2);
	    LibLinkedList.add(w, 3, 3);
	    LibLinkedList.add(w, 1, 4);
	    LibLinkedList.add(w, 2, 5);
	    LibLinkedList.add(w, 1, 6);
	    LibLinkedList.add(w, 3, 7);
	    LibLinkedList.add(w, 2, 8);
	   
	    
	    LibLinkedList.remove(w, 1);
	    LibLinkedList.remove(w, 2);
	    LibLinkedList.remove(w, 3);
	    LibLinkedList.remove(w, 4);
		
	    System.out.println("   " +  LibLinkedList.indexOf(w, 1));
	    System.out.println("   " +  LibLinkedList.indexOf(w, 1));
		
		
	}

}
