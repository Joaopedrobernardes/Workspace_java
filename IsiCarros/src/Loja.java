
public class Loja {
	public static void main(String[] args) {
		// Casrro eh meu novo tipo de dado
		// c1 e c2 sao as variaveis deste novo tipo - chamamos de objetos
		Carro c1;
		Carro c2;

		// se fosse um tipo comum, ja estava ok.. porem como falamos de classes
		// precisamos solicitar a maquina virtual um espaco de memoria
		c1 = new Carro();
		c2 = new Carro();

		// Vamos atribuir valores (forcando mesmo)
		c1.marca = "Porxy";
		c1.modelo = "kaineni";
		c1.ano = 2021;
		c1.cor = "Preto";
		c1.preco = 78000;

		c2.marca = "Xevrole";
		c2.modelo = "Corca";
		c2.ano = 1997;
		c2.cor = "Prata meio gasto";
		c2.preco = 7500;

		// Vamos exibir o anuncio
		c1.exibirInfo();
		c2.exibirInfo();

		c1.aplicarDesconto(10.0);
		c2.aplicarDesconto(5.0);
		// exibindo o novo valor com desconto

		c1.exibirInfo();
		c2.exibirInfo();

		double ipvaC1 = c1.calcularIpva();
		double ipvaC2 = c2.calcularIpva();

		System.out.println("Valor do IPVA do " + c1.modelo + " = " + c1.calcularIpva());
		System.out.println("Valor do IPVA do " + c2.modelo + " = " + c2.calcularIpva());
	}
}
