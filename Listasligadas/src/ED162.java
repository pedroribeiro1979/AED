import java.util.Arrays;
import java.util.Scanner;

import org.omg.CosNaming.IstringHelper;

public class ED162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bubble Sort Optimized ...");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] values3 = new String[n] ;

		for (int i=0; i< n; i++) {
			String s = sc.next(); 
			values3[i] = s;


		}
		
		SortingSearching.bubbleSort0(values3);
		for (int i= n-1; i>= 0; i--) {
		System.out.println(values3[i]);
		}



	}

}
