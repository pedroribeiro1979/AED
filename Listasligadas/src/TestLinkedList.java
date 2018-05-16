public class TestLinkedList {
  public static void main(String args[]) {
    LinkedList<Integer> l = new LinkedList<Integer>();
    for(int i = 8 ; i > 0 ; i--)
      LibLinkedList.addFirst(l, new Integer(i));                 // cria uma lista de tamanho 
    System.out.println("list size: " + LibLinkedList.size(l));
    LibLinkedList.add(l, 55, 5);
    LibLinkedList.add(l, 22, 9);  
    LibLinkedList.addLast(l,33);  
    System.out.println("list size: " + LibLinkedList.size(l));
    System.out.println(LibLinkedList.toString(l));
    LibLinkedList.removeFirst(l); 
    LibLinkedList.remove(l, 3);
    System.out.println("indexOf(6): " + LibLinkedList.indexOf(l, 55));
    System.out.println("indexOf(6): " + LibLinkedList.indexOf(l, 6));
    System.out.println(LibLinkedList.toString(l));
    
    LinkedList<Character> w = new LinkedList<Character>();
    LibLinkedList.add(w, ('a'), 0);
    LibLinkedList.add(w, ('e'), 1);
    LibLinkedList.add(w, ('i'), 2);
    LibLinkedList.add(w, ('o'), 3);
    LibLinkedList.add(w, ('u'), 4);
    System.out.println("list size: " + LibLinkedList.size(w));
    System.out.println(LibLinkedList.toString(w));
    
    System.out.println(LibLinkedList.copy(w));
    
    
    
    
    
    
  }
}
