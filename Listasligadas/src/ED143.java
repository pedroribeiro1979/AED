import java.util.Scanner;

class Account {
	double inicialBalance;
	double balance;                    // O saldo da conta
	LinkedList<Double> movements;      // Os movimentos

	Account() {
		inicialBalance = 0.00;
		balance = 0;
		movements = new LinkedList<Double>();
	}	
}

class LibAccount {
	public static void deposit(Account a, double m) {
		a.balance += m;
		LibLinkedList.addLast(a.movements, m);

	}

	public static void withdraw(Account a, double m) {
		a.balance -= m;
		LibLinkedList.addLast(a.movements, -m);
	}

	public static void getMovements(Account a) {    // nova linha 
		for (int i = 0 ; i < a.movements.size; i++)
		{
			a.inicialBalance = a.inicialBalance + LibLinkedList.get(a.movements, i);
			System.out.println("Movimentos_" + (i+1) + " " + LibLinkedList.get(a.movements, i) + "-> "
					+ a.inicialBalance);
		}
	}

}

class ED143 {
	public static void main(String[] args) {

		
		Account a = new Account();

		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		for (int i=0; i<n; i++) {
			String op = in.next();
			if (op.equals("depositar"))     LibAccount.deposit(a, in.nextDouble());
			else if (op.equals("levantar")) LibAccount.withdraw(a, in.nextDouble());
		}
		System.out.printf("Saldo: " + a.balance + "\n");
		System.out.printf("Numero de movimentos: " + a.movements.size + "\n");
		LibAccount.getMovements(a);
		
		
	}
}