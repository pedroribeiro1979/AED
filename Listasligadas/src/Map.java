
class Map<K extends Comparable<? super K>,V> {
  BSTree<K,V> tree;
 
  Map() {
    tree = new BSTree<K,V>();
  }

}
