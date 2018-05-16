import java.util.LinkedList;

class LibMap<K extends Comparable<? super K>,V> {

  public static <K extends Comparable<? super K>,V>
  int size(Map<K,V> m) {
    return LibBSTree.size(m.tree);  
  }  

  public static <K extends Comparable<? super K>,V>
  void put(Map<K,V> m, K key, V val) {
    LibBSTree.insert(m.tree, key, val);  
  }  

  public static <K extends Comparable<? super K>,V>
  V get(Map<K,V> m, K key) {
    return LibBSTree.get(m.tree, key);  
  }  

  public static <K extends Comparable<? super K>,V>
  void remove(Map<K,V> m, K key) {
    LibBSTree.remove(m.tree, key);  
  }  

  public static <K extends Comparable<? super K>,V>
  boolean contains(Map<K,V> m, K key) {
    return LibBSTree.contains(m.tree, key);  
  }  

  public static <K extends Comparable<? super K>,V>
  LinkedList<K> keys(Map<K,V> m) {
    return LibBSTree.keys(m.tree);
  }

  public static <K extends Comparable<? super K>,V>
  String toString(Map<K,V> m) {
    return LibBSTree.toString(m.tree);
  }

  public static <K extends Comparable<? super K>,V extends Comparable<? super V>> 
  Map<K,V> invert(Map<V,K> p) {
    LinkedList<V> l = LibMap.keys(p);
    Map<K,V> q = new Map<K,V>();
    for(int i = 0; i < l.size(); i++ ) {
      V  k = l.get(i);
      K  v = LibMap.get(p,k);
      LibMap.put(q,v,k);
    }
    return q;
  }
}
