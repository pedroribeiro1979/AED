

public class ED147 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Character> w = new LinkedList<Character>();
		LibLinkedList.add(w, ('1'), 0);
	    LibLinkedList.add(w, ('2'), 1);
	    LibLinkedList.add(w, ('3'), 2);
	    LibLinkedList.add(w, ('4'), 3);
	    LibLinkedList.add(w, ('5'), 4);
	    LibLinkedList.add(w, ('6'), 5);
	    LibLinkedList.add(w, ('7'), 6);
	    LibLinkedList.add(w, ('8'), 7);
	    LibLinkedList.add(w, ('9'), 8);
	    
	    LibLinkedList.oddPositions(w);
	    
	    
		LinkedList<Character> b = new LinkedList<Character>();
		LibLinkedList.add(b, ('a'), 0);
	    LibLinkedList.add(b, ('b'), 1);
	    LibLinkedList.add(b, ('c'), 2);
	    LibLinkedList.add(b, ('d'), 3);
	    LibLinkedList.add(b, ('e'), 4);
	    LibLinkedList.add(b, ('f'), 5);
	    LibLinkedList.add(b, ('g'), 6);
	    LibLinkedList.add(b, ('h'), 7);
	    LibLinkedList.add(b, ('i'), 8);
		
	    LibLinkedList.oddPositions(b);
		
	}

}
