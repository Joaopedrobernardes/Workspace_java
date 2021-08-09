package apresentacao;

import nucleo.Conta;
import nucleo.ContaEspecial;

public class Banco {
	public static void main(String[] args) {
		
		Conta c1;
		c1 = new Conta ("Joao", "1234", 90214);
					
		System.out.println(c1.exibirInfo());
		c1.creditar(100);
		System.out.println(c1.exibirInfo());
		if(c1.debitar(200)) {
			System.out.println("Debito efetivado");
		}
		else {
			System.out.println("Saldo Insuficiente");
			
		}
		System.out.println(c1.exibirInfo());
		
		//usando a conta especial, o debito permite que eu tenha saldo negativo ate certo limite. Herança associada ao Polimorfismo(mesma referencia, pode assumir varias formas (classe pai ou outra dependente ))
		//sempre o debitar do objeto que da o New
		ContaEspecial c2;
		c2 = new ContaEspecial("Asdasdas", "12345", 5232, 200);
		System.out.println(c2.exibirInfo());
		c2.creditar(30);
		System.out.println(c2.exibirInfo());
		if (c2.debitar(123)) {
			System.out.println("Debito Efetivado");
		
	}
		else {
			System.out.println("Saldo insuficiente");
	}
			System.out.println(c2.exibirInfo());
	}
}
