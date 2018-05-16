
class BSTNode<K extends Comparable<? super K>,V> {
  K          key;
  V          val;
  BSTNode<K,V> left;
  BSTNode<K,V> right;

  BSTNode(K k, V v, BSTNode<K,V> l, BSTNode<K,V> r) {
     key   = k; 
     val   = v; 
     left  = l;
     right = r;
  }

  BSTNode(K k, V v) {
     key   = k; 
     val   = v; 
     left  = null;
     right = null;
  }
}


public class BSTree<K extends Comparable<? super K>,V> {
  BSTNode<K,V> root;

  BSTree(BSTNode<K,V> node) {
    root = node;
  }

  BSTree() {
    root = null;
  }
}
