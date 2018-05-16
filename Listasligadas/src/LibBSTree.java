import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Math; 

class LibBSTree<K extends Comparable<? super K>,V> {

	public static <K extends Comparable<? super K>,V> 
	boolean isEmpty(BSTree<K,V> t) {
		return (t.root == null);
	}

	public static <K extends Comparable<? super K>,V> 
	int size(BSTree<K,V> t) {
		return size(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	int size(BSTNode<K,V> n) {
		if ( n == null ) 
			return 0;
		else 
			return 1 + size(n.left) + size(n.right);
	}

	public static <K extends Comparable<? super K>,V> 
	int depth(BSTree<K,V> t) {
		return depth(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	int depth(BSTNode<K,V> n) {
		if ( n == null ) 
			return 0;
		else 
			return 1 + Math.max( depth(n.left), depth(n.right));
	}

	public static <K extends Comparable<? super K>,V> 
	void insert(BSTree<K,V> t, K key, V val) {
		t.root = insert(t.root, key, val);
	}

	private static <K extends Comparable<? super K>,V> 
	BSTNode<K,V> insert(BSTNode<K,V> n, K key, V val) {
		if ( n == null )
			return new BSTNode<K,V>(key,val);
		else {
			int cmp = key.compareTo(n.key);
			if (cmp == 0)
				n.val = val;
			else if (cmp < 0)
				n.left = insert(n.left, key, val);
			else
				n.right = insert(n.right, key, val);
		}
		return n;
	}

	public static <K extends Comparable<? super K>,V> 
	boolean contains(BSTree<K,V> t, K key) {
		return contains(t.root, key);
	}

	private static <K extends Comparable<? super K>,V> 
	boolean contains(BSTNode<K,V> n, K key) {
		if ( n == null )
			return false;
		else 
			if ( key.compareTo(n.key) == 0 ) 
				return true;
		if ( key.compareTo(n.key) < 0 ) 
			return contains(n.left, key);
		else
			return contains(n.right, key);
	}

	public static <K extends Comparable<? super K>,V> 
	V get(BSTree<K,V> t, K key) {
		return get(t.root, key);
	}

	private static <K extends Comparable<? super K>,V> 
	V get(BSTNode<K,V> n, K key) {
		if ( n == null )
			return null;
		else 
			if ( key.compareTo(n.key) == 0 ) 
				return n.val;
		if ( key.compareTo(n.key) < 0 ) 
			return get(n.left, key);
		else
			return get(n.right, key);
	}

	public static <K extends Comparable<? super K>,V> void remove(BSTree<K,V> t, K key) {
		t.root = remove(t.root, key);
	}

	private static <K extends Comparable<? super K>,V> BSTNode<K,V> remove(BSTNode<K,V> n, K key) {
		if ( n != null )
			if ( key.compareTo(n.key) < 0 ) 
				n.left = remove(n.left, key);
			else if ( key.compareTo(n.key) > 0 ) 
				n.right = remove(n.right, key);
			else if ( n.left == null )
				n = n.right;
			else if ( n.right == null )
				n = n.left;
			else
				n.right = removeMinimum(n, n.right);
		return n;
	}

	private static <K extends Comparable<? super K>,V> 
	BSTNode<K,V> removeMinimum(BSTNode<K,V> n1, BSTNode<K,V> n2) {
		if ( n2.left == null ) {
			n1.key = n2.key;
			n1.val = n2.val;
			return n2.right;
		} else {
			n2.left = removeMinimum(n1, n2.left);
			return n2;
		}
	}

	public static <K extends Comparable<? super K>,V> 
	String toString(BSTree<K,V> t) {
		return toString(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	String toString(BSTNode<K,V> n) {
		if ( n != null ) 
			return toString(n.left) + "(" + n.key + "," + n.val + ")" + toString(n.right);
		return "";
	}

	public static <K extends Comparable<? super K>,V> 
	void visitDepthFirst(BSTree<K,V> t) {
		visitDepthFirst(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	void visitDepthFirst(BSTNode<K,V> n) {
		Stack<BSTNode<K,V>> stack = new Stack<BSTNode<K,V>>();
		BSTNode<K,V> np = n;
		while (( np != null ) || !stack.isEmpty() ) {
			while ( np != null ) {
				stack.push( np );
				np = np.left;
			}
			if ( !stack.isEmpty() ) {
				np = stack.pop();
				System.out.println("(" + n.key + "," + n.val + ")");
				np = np.right;
			}
		}
	}

	public static <K extends Comparable<? super K>,V> 
	void visitBreadthFirst(BSTree<K,V> t) {
		visitBreadthFirst(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	void visitBreadthFirst(BSTNode<K,V> n) {
		Queue<BSTNode<K,V>> queue = new LinkedList<BSTNode<K,V>>();
		queue.add(n);
		while (!queue.isEmpty()) {
			BSTNode<K,V> np = queue.remove(); 
			System.out.println("(" + np.key + "," + np.val + ")");
			if ( np.left != null ) 
				queue.add(np.left);
			if ( np.right != null ) 
				queue.add(np.right);
		}
	}

	public static <K extends Comparable<? super K>,V> 
	LinkedList<K> keys(BSTree<K,V> t) {
		LinkedList<K> l = new LinkedList<K>();
		keys(t.root,l);
		return l;
	}

	private static <K extends Comparable<? super K>,V> 
	void keys(BSTNode<K,V> n, LinkedList<K> l) {
		if ( n != null ) {
			keys(n.left,l);
			l.addLast(n.key);
			keys(n.right,l);
		}
	}

	public static <K extends Comparable<? super K>,V> 
	int keysLessThan(BSTree<K,V> t, K key) {
		return keysLessThan(t.root,key);
	}

	private static <K extends Comparable<? super K>,V>
	int keysLessThan(BSTNode<K,V> n, K key) {
		if ( n == null ) 
			return 0;
		if ( (n.key).compareTo(key) < 0 )
			return 1 + size(n.left) + keysLessThan(n.right,key);
		else
			return keysLessThan(n.left,key);
	}

	public static <K extends Comparable<? super K>,V> 
	boolean isomorphic(BSTree<K,V> t1, BSTree<K,V> t2) {
		return isomorphic(t1.root,t2.root);
	}

	private static <K extends Comparable<? super K>,V> 
	boolean isomorphic(BSTNode<K,V> n1, BSTNode<K,V> n2) {
		if (n1 == null && n2 == null) 
			return true;
		if (n1 != null && n2 != null) {
			if (n1.left == null && n2.left == null && n1.right != null && n2.right != null)
				return isomorphic(n1.right,n2.right);
			if (n1.left != null && n2.left != null && n1.right == null && n2.right == null)
				return isomorphic(n1.left,n2.left);
			return isomorphic(n1.left,n2.left) && isomorphic(n1.right,n2.right);
		}
		return false;
	} 

	public static <K extends Comparable<? super K>,V> 
	int noLeaves(BSTree<K,V> t) {
		return noLeaves(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	int noLeaves(BSTNode<K,V> n) {
		if ( n == null ) 
			return 0;
		if ( n.left == null && n.right == null)
			return 0;
		else
			return 1 + noLeaves(n.left) + noLeaves(n.right);
	}

	public static <K extends Comparable<? super K>,V> 
	String pathTo(BSTree<K,V> t, K key) {
		return pathTo(t.root,new String(), key);
	}

	private static <K extends Comparable<? super K>,V> 
	String pathTo(BSTNode<K,V> n, String p, K key) {
		if ( n == null )
			return null;
		if ( key.compareTo(n.key) == 0 ) 
			return p;
		if ( key.compareTo(n.key) < 0 ) 
			return pathTo(n.left , new String(p+"E"), key);
		else
			return pathTo(n.right, new String(p+"D"), key);
	}

	public static <K extends Comparable<? super K>,V> 
	int leaves(BSTree<K,V> t) {
		return leaves(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	int leaves(BSTNode<K,V> n) {
		if ( n == null ) 
			return 0;
		if ( n.left == null && n.right == null)
			return 1;
		else 
			return leaves(n.left) + leaves(n.right);
	}

	public static <K extends Comparable<? super K>,V> 
	boolean isBalanced(BSTree<K,V> t) {
		return isBalanced(t.root);
	}

	private static <K extends Comparable<? super K>,V> 
	boolean isBalanced(BSTNode<K,V> n) {
		if ( n == null ) 
			return true;
		return ( (depth(n.left) - depth(n.right)) > 1 ) && isBalanced(n.left) && isBalanced(n.right);
	}

	// --------------------------------------------------------
	// Example non generic methods (only work for Integers)
	// --------------------------------------------------------

	public static int maxSum(BSTree<Integer,Integer> t) {
		return maxSum(t.root);
	}

	public static int maxSum(BSTNode<Integer,Integer> n) {
		if ( n == null ) 
			return 0;
		else 
			return n.val + Math.max(maxSum(n.left),maxSum(n.right));
	}

	public static int[] sumLevels(BSTree<Integer, Integer> t) {
		int[] sums = new int[depth(t.root)];
		sumLevels(t.root, sums, 0);
		return sums;
	}

	public static void sumLevels(BSTNode<Integer, Integer> n, int[] sums, int level) {
		if ( n != null ) {
			sums[level] += n.val;
			sumLevels(n.left,sums,level+1);
			sumLevels(n.right,sums,level+1);
		}
	}


	public static int sum(BSTree<Integer,Integer> t) {


		return sum(t.root);
	}


	public static int sum(BSTNode<Integer,Integer> n) {

		if ( n == null ) {
			return 0;
		}else {
			return n.val + sum( n.left) + sum(n.right) ;

		}


	}


	public static void printInOrder(BSTree<Integer, Integer> t) {
		printInOrder(t.root);
		System.out.println();
	}

	public static void printInOrder(BSTNode<Integer, Integer> n) {
		if (n!=null) {
			printInOrder(n.left);
			System.out.print(" " + n.key + " " );
			printInOrder(n.right);
		}
	}

	public static void printPreOrder(BSTree<Integer, Integer> t) {
		printPreOrder(t.root);
		System.out.println();
	}

	public static void printPreOrder(BSTNode<Integer, Integer> n) {			


		if (n !=null) 
		{
			System.out.print(" " + n.key + " ");
			printPreOrder(n.left);
			printPreOrder(n.right);
		}
	}


	public static void printPostOrder(BSTree<Integer, Integer> t) {
		printPostOrder(t.root);
		System.out.println();
	}

	public static void printPostOrder(BSTNode<Integer, Integer> n) {			


		if (n !=null) 
		{
			printPostOrder(n.left);
			printPostOrder(n.right);
			System.out.print( " " + n.key + " ");
		}
	}

	public static <K extends Comparable<? super K>,V> int keysGreaterThan(BSTree<K,V> t, K key) 
	{
		return keysGreaterThan(t.root,key);
	}

	private static <K extends Comparable<? super K>,V> int keysGreaterThan(BSTNode<K,V> n, K key) 
	{
		if ( n == null ) 
		{
			return 0;
		}
		if ( (n.key).compareTo(key) > 0 ) 
		{
			return 1 + size(n.left) + keysGreaterThan(n.right,key);
		}else 
		{
			return keysGreaterThan(n.left,key);
		}
	}

	/* ****************************************************************************************************** */
	/* ****************************************************************************************************** */
	/* ****************************************************************************************************** */	
	/* ****************************************************************************************************** */



	public static <K extends Comparable<? super K>,V> K minimum(BSTree<K,V> t){

		return minimum(t.root);


	}
	public static <K extends Comparable<? super K>,V> K minimum(BSTNode<K,V> t)
	{
		if (t.left == null )
		{
			return t.key;
		}
		return minimum(t.left);
	}

	public static <K extends Comparable<? super K>,V> K maximum(BSTree<K,V> t) 
	{
		return maximum(t.root);
	}
	
	public static <K extends Comparable<? super K>,V> K maximum(BSTNode<K,V> t) 
	{
		if (t.right == null)
		{
			return t.key;
		}
		else 
		{
			return  maximum(t.right) ;
		}		
	}

	public static <K extends Comparable<? super K>,V> int minDepth(BSTree<K,V> t) {

		


	}
	
	public static <K extends Comparable<? super K>,V> int minDepth(BSTNode<K,V> t) {
		
		
		
	}





}