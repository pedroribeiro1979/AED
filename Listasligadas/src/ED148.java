

public class ED148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> w = new LinkedList<Integer>();
		LibLinkedList.add(w, (1), 0);
	    LibLinkedList.add(w, (2), 1);
	    LibLinkedList.add(w, (1), 2);
	    LibLinkedList.add(w, (3), 3);
	    LibLinkedList.add(w, (1), 4);
	    LibLinkedList.add(w, (2), 5);
	    LibLinkedList.add(w, (1), 6);
	    LibLinkedList.add(w, (3), 7);
	    LibLinkedList.add(w, (2), 8);
	   
	    
	    System.out.println("Numero de vezes que o numero 1 aparece: " + LibLinkedList.count(w, 1));
	    System.out.println("Numero de vezes que o numero 2 aparece: " + LibLinkedList.count(w, 2));
	    System.out.println("Numero de vezes que o numero 3 aparece: " + LibLinkedList.count(w, 3));
	    System.out.println("Numero de vezes que o numero 4 aparece: " + LibLinkedList.count(w, 4));
	}

}
