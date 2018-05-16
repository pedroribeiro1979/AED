import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class ED164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);

		int npalavras = 0;	
		String palavra;


		try {


			BufferedReader fl = new BufferedReader(new FileReader("file/palavras.txt")); 
			npalavras = Integer.parseInt(fl.readLine());
			Equipa equip[] = new Equipa[npalavras];

			String str_line = null; 
			String [] equi = new String[6] ;
			int i = 0;

			while ((str_line = fl.readLine()) != null) 
			{ 
				

				if ((str_line.length()!=0))  
				{ 
					equi = str_line.(); 
					equip[i] = new    ;
					i++;
				} 

			}

			Arrays.sort(equip);
			for (int j = 0; j< npalavras ; j++)
				System.out.println(equip[j].nomeEquipa + " " + equip[j].nPontos + " " + equip[j].goalA);

		}
		catch (Exception e)  
		{
			// Catch exception if any
			System.err.println("Error: " + e.getMessage());

		}

	}
	
		
		
		
		
		
		
		
	

}
