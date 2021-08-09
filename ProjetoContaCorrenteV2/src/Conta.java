/* aqui vamos fazer o exemplo de encapsulamento
 * 
 * tentar associar o encapsulamento = blindagem
 */
public class Conta {
	// atributos sempre deixa private
	//private para proteger a estrutura do objeto
	// public para poder tornar acessivel nao apenas de mesma pasta, mas classes de outras pastas acessem
	// this para referenciar diretamente o atributo, sempre vai referir o atributo!! (em caso de coincidencias) 
	private int numeroConta;
	private int digitoVerif;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	//metodos que mexe com parametros, sempre deixa public
//	public void setNumeroConta (int novoNumero) {
//		//aqui poderia fazer a rotina de validacao que quiser. 
//		this.numeroConta = numeroConta;
//	}
//	
//	public int getNumeroConta() {
//		return numeroConta;
//	}
//	
	
	public String exibir() {
		return "Conta "+numeroConta+"/"+digitoVerif+"\n"+
				"      Titular: "+nomeTitular+" ("+cpfTitular+") "+ "\n"+
				"      Saldo  :   R$ "+saldo;
		

	}
	public void depositar(double valor) {
		saldo = saldo + valor;
		
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
	
		return false;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDigitoVerif() {
		return digitoVerif;
	}
	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

