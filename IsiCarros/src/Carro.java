
public class Carro {
	// vamos apenas declarar as variaveis que compoem o tipo CARRO
	String marca;
	String modelo;
	int ano;
	String cor;
	double preco;

	void exibirInfo() {
		System.out.println("Automovel: " + marca + " " + modelo);
		System.out.println("    Ano: " + ano);
		System.out.println("    Cor: " + cor);
		System.out.println("    Preco: R$ " + preco + "\n");
	}

	// agora tenho uma funcionalidade que altera o valor do preco
	// porem esse percentual de desconto torna-se flexivel podendo ser diferente
	// para cada objeto que o chama
	void aplicarDesconto(double percentual) {
		preco = preco - preco * percentual / 100;

	}

	// outra funcionalidade que retorne o valor de IPVA do carro baseado em seu
	// preco
	// tipo nome da func
	// calc ipva e uma func que retorna um valor

	double calcularIpva() {
		double valoripva;

		if (ano < 2000)

		{
			valoripva = 0.0;
		} else {
			valoripva = preco * 0.02;
		}
		return valoripva;
	}

}
