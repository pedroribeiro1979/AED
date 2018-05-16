// Exemplo de ordenacao customizada de pessoas. Primeiro por ordem crescente da idade,
// e em caso de empate por ordem crescente alfabetica do nome

import java.util.Scanner;
import java.awt.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// Classe para guardar uma pessoa
class Person implements Comparable<Person> {
	public int age;
	public String name;

	Person(int a, String n) {
		age = a;
		name = n;
	}

	// Definir como comparar dois elementos da classe Person
	// compareTo e uma funcao que compara objecto com outro objecto "p"
	// Esta funcao deve devolver:
	//  - numero < 0 se objecto for menor que objecto "p"
	//  - numero > 0 se objecto for maior que objecto "p"
	//  - zero, se objecto for igual ao objecto "p"
	public int compareTo(Person p) {
		if (age < p.age) return -1;
		if (age > p.age) return +1;
		return name.compareTo(p.name);
	}
}

public class CustomSort {
	public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);

		int tamanho = 0;	



		try {

		
			BufferedReader fl = new BufferedReader(new FileReader("file/persons.txt")); 
			tamanho = Integer.parseInt(fl.readLine());
			Person v[] = new Person[tamanho];

			String str_line = null; 
			String [] pessoa = new String[2] ;
			int i = 0;
			
			while ((str_line = fl.readLine()) != null) 
			{ 
				System.out.println("Ordem No Ficheiro :" + str_line);

				 if ((str_line.length()!=0))  
				{ 
					pessoa = str_line.split(" "); 
					v[i] = new Person(Integer.parseInt(pessoa[0]), pessoa[1]);
					i++;
				} 
				
			}

			Arrays.sort(v);
			for (int j = 0; j< tamanho ; j++)
			System.out.println("Ordenado " + j + " : "  + v[j].age + " " + v[j].name);

		}
		catch (Exception e)  
		{
			// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		//for (int i = 0; i<n; i++)
		//v[i] = new Person(stdin.nextInt(), stdin.next());
		// Chamada ao sort padrao da linguagem Java
		// Usa o comparador padrao do tipo do array

	}
}