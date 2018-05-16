

public class ED144 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Character> u = new LinkedList<Character>();
		
		LibLinkedList.add(u, ('1'), 0);
		LibLinkedList.add(u, ('2'), 1);
		LibLinkedList.add(u, ('3'), 2);
		LibLinkedList.add(u, ('4'), 3);
		
		//System.out.println(" old List: " + LibLinkedList.toString(l));
		System.out.println("Nova LinkedList : " + LibLinkedList.toString(LibLinkedList.copy(u)));
		
	}

}
