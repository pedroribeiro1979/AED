

class Aula10 {

	public static void main(String[] args) {


		int[] data = {14, 4, 18, 3, 9, 16, 20, 7, 15, 17, 5};
		//int [] data2 = {10, 2, 9, 1, 4, 5, 3};
		//BSTree<Integer,Integer> t2 = new BSTree <Integer,Integer>();
		BSTree<Integer,Integer> t = new BSTree<Integer,Integer>();
		for(int i = 0 ; i < data.length ; i++ ) 
		{

			LibBSTree.insert(t, data[i], data[i]);
		}

		System.out.println("size t:  " + LibBSTree.size(t));
		System.out.println("depth t: " + LibBSTree.depth(t));
		System.out.println("sum t :  " + LibBSTree.sum(t));
		System.out.println("InOrder t: ");
		LibBSTree.printInOrder(t);
		System.out.println("PreOrder t: ");
		LibBSTree.printPreOrder(t);
		System.out.println("PostOrder t: ");
		LibBSTree.printPostOrder(t);
		System.out.println("Contem 7 : " + LibBSTree.contains(t, 7));
		System.out.println("Contem 8 : " + LibBSTree.contains(t, 8));
		System.out.println("Menores q 16 : " + LibBSTree.keysLessThan(t, 16));
		System.out.println("Maiores q 16 : " + LibBSTree.keysGreaterThan(t, 16));
		System.out.println("Menor Valor:  " + LibBSTree.minimum(t));
		System.out.println("Maior Valor : " + LibBSTree.maximum(t));
		System.out.println("Menor Profundidade da Folha : " + LibBSTree.minDepth(t));
		
		
		//for(int w = 0 ; w < data2.length ; w++ ) 
		//{
			//LibBSTree.insert(t2, data2[w], data2[w]);
		//}

		//System.out.println("--------------------------------------------------------------");
		//System.out.println("--------------------------------------------------------------");
		//System.out.println("size t2 :  " + LibBSTree.size(t2));
		//System.out.println("depth t2 : " + LibBSTree.depth(t2));
		//System.out.println("sum t2 :  " + LibBSTree.sum(t2));
		//System.out.println("InOrder t2: ");
		//LibBSTree.printInOrder(t2);
		//System.out.println("PreOrder t2: ");
		//LibBSTree.printPreOrder(t2);
		//System.out.println("PostOrder t2: ");
		//LibBSTree.printPostOrder(t2);
		//System.out.println("Contem  7 : " + LibBSTree.contains(t2, 7));
		//System.out.println("Contem 10 : " + LibBSTree.contains(t2, 10));
		//System.out.println("Menores q 16 : " + LibBSTree.keysLessThan(t2, 16));
		//System.out.println("Maiores q 16 : " + LibBSTree.keysGreaterThan(t2, 16));
		//System.out.println(LibBSTree.minimum(t2));
		
		
		
	}


}
