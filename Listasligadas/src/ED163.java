import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


//Classe para guardar uma pessoa
class Equipa implements Comparable<Equipa> {
	public int nPontos;
	public int goalA;
	public String nomeEquipa;

	Equipa(int nPontos, int goalA, String nomeEquipa) {
		this.nPontos = nPontos;
		this.goalA = goalA;
		this.nomeEquipa = nomeEquipa;
	}

	// Definir como comparar dois elementos da classe Person
	// compareTo e uma funcao que compara objecto com outro objecto "p"
	// Esta funcao deve devolver:
	//  - numero < 0 se objecto for menor que objecto "p"
	//  - numero > 0 se objecto for maior que objecto "p"
	//  - zero, se objecto for igual ao objecto "p"
	public int compareTo(Equipa e) {
		if (nPontos > e.nPontos) return -1;
		if (nPontos < e.nPontos) return +1;
		return nomeEquipa.compareTo(e.nomeEquipa);
	}
}




public class ED163 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner stdin = new Scanner(System.in);

		int tamanho = 0;	



		try {


			BufferedReader fl = new BufferedReader(new FileReader("file/Equipas.txt")); 
			tamanho = Integer.parseInt(fl.readLine());
			Equipa equip[] = new Equipa[tamanho];

			String str_line = null; 
			String [] equi = new String[6] ;
			int i = 0;

			while ((str_line = fl.readLine()) != null) 
			{ 
				//System.out.println("Ordem No Ficheiro :" + str_line);

				if ((str_line.length()!=0))  
				{ 
					equi = str_line.split(" "); 
					equip[i] = new Equipa((Integer.parseInt(equi[1])*3) + Integer.parseInt(equi[2]), (Integer.parseInt(equi[4]) - Integer.parseInt(equi[5])), equi[0]  );
					i++;
				} 

			}

			Arrays.sort(equip);
			for (int j = 0; j< tamanho ; j++)
				System.out.println(equip[j].nomeEquipa + " " + equip[j].nPontos + " " + equip[j].goalA);

		}
		catch (Exception e)  
		{
			// Catch exception if any
			System.err.println("Error: " + e.getMessage());

		}

	}
}
