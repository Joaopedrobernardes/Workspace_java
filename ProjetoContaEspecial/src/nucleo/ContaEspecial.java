package nucleo;

// da conta especial para a conta comum, é poder ter uma outra logica para uma funcionalidade que tem...




public class ContaEspecial extends Conta{ //tem extends, obrigatoriamente tem que ter construtor
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numero, double limite) {
		super(nomeTitular, cpf, numero); //chama obrigatoriamente o construtor da classe PAI
		this.limite = limite;
		
	}	
	public String exibirInfo() {
		return "Conta Especial: "+super.numeroConta+" - "+super.nomeTitular+ "("+super.cpfTitular+") R$ "+String.format("%.2f", super.saldo)+
				"Limite R$ "+String.format("%.2f", this.limite);
	}

	public boolean debitar (double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo = saldo - valor; // ||NAO PRECISARIA COLOCAR, COLOCOU DE PROPOSITO O SUPER||
											// para o super é só para definir que nao é um atributo da classe PAI é um  atributo da classe que herdou
			return true;
		}
		return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	

}
