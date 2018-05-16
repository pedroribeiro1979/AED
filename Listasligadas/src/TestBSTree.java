import java.util.Arrays;
import java.lang.Math;

class TestBSTree {
  public static void main(String[] args) {
    int[] data = {14, 4, 18, 3, 9, 16, 20, 7, 15, 17, 5};
    BSTree<Integer,Integer> t1 = new BSTree<Integer,Integer>();
    for(int i = 0 ; i < data.length ; i++ )
	LibBSTree.insert(t1, data[i], data[i]);
    System.out.println("size:  " + LibBSTree.size(t1));
    System.out.println("depth: " + LibBSTree.depth(t1));
    System.out.println(LibBSTree.toString(t1));
    System.out.println("less than " + 7  + ": " + LibBSTree.keysLessThan(t1, 7));    
    System.out.println("less than " + 15 + ": " + LibBSTree.keysLessThan(t1, 15));    

    BSTree<Integer,Integer> t2 = new BSTree<Integer,Integer>();
    for(int i = 0 ; i < data.length ; i++ )
	LibBSTree.insert(t2, data[i], data[i]);
    System.out.println("t1 is isomorphic to t2? " + LibBSTree.isomorphic(t1,t2));
    LibBSTree.remove(t2,9);
    System.out.println("t1 is isomorphic to t2? " + LibBSTree.isomorphic(t1,t2));
    LibBSTree.insert(t2,9,9);
    System.out.println("t1 is isomorphic to t2? " + LibBSTree.isomorphic(t1,t2));
    System.out.println("t1 is isomorphic to t2? " + LibBSTree.isomorphic(t1,new BSTree<Integer,Integer>()));

    BSTree<Integer,Integer> t3 = new BSTree<Integer,Integer>();
    for(int i = 0 ; i < data.length ; i++ )
	LibBSTree.insert(t3, data[i], data[i]);

    System.out.println("maxSum(t3) = " + LibBSTree.maxSum(t3));

    System.out.println("path to  5: " + LibBSTree.pathTo(t3,5));
    LibBSTree.remove(t3,9);
    LibBSTree.insert(t3,9,9);
    System.out.println("path to  9: " + LibBSTree.pathTo(t3,9));
    System.out.println("path to 16: " + LibBSTree.pathTo(t3,16));
    System.out.println("path to 21: " + LibBSTree.pathTo(t3,21));


    System.out.println("noLeaves(t3) = " + LibBSTree.noLeaves(t3));
    LibBSTree.remove(t3,9);
    System.out.println("noLeaves(t3) = " + LibBSTree.noLeaves(t3));
    LibBSTree.remove(t3,5);
    System.out.println("noLeaves(t3) = " + LibBSTree.noLeaves(t3));

    System.out.println("leaves(t3) = " + LibBSTree.leaves(t3));
    System.out.println("isBalanced(t3) = " + LibBSTree.isBalanced(t3));
    System.out.println("sumLevels(t3) = " + Arrays.toString(LibBSTree.sumLevels(t3)));
  }

}
