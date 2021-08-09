import java.util.Scanner;

public class Banco {
	public static void main(String[] args) {
		/*
		 * qual o intuito dessa aplicacao? 1- declarar nossas variaveis tipo "Conta" 2-
		 * vamos fazer um menu para manipular 1 conta so? depositar, sacar e exibir as
		 * infos? 3- toda interacao com o usuario (print e scanner) fica aqui
		 */
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		
		Conta c1;
		c1 = new Conta();
		c1.setNumeroConta(1232);
		c1.setDigitoVerif(6);
		c1.setNomeTitular("Isidro");
		c1.setCpfTitular("122.332.435-12");
		c1.setSaldo(200.00);
		
		// agora vem meu menu!!
		
		do {
			System.out.println("Bem vindo ao Itau - Seu Netbank");
			System.out.println("Digita 1-Info / 2 - Deposito / 3 - Saque / 0 - Encerrar");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(c1.exibir());
				break;
			case 2:
				System.out.println("[DEPOSITO] Digite o valor:");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
			case 3:
				System.out.println("[SAQUE] Digite o valor:");
				valor = teclado.nextDouble();
				if (c1.sacar(valor)) {
					System.out.println("    SAQUE AUTORIZADO");
				}
				else {
					System.out.println("    SALDO INSUFICIENTE");
				}
				break;
			case 0:
				System.out.println("---> Obrigado pela preferencia!");
				break;
			default:
				System.out.println("ERRO: Opcao Invalida");
			}
			
		} while (opcao != 0);
		
		teclado.close();
		

	}

}
