
public class FolhadePagamento {
	private int numeroFuncional;
	private String nome;
	private String email;
	private double salario;

	// vou criar um metodo especifico, que só pode ser chamado no momento do NEW...
	// este metodo é chamado CONSTRUTOR e serve geralmente para inicializar valores no objeto
	
	public FolhadePagamento(int numeroFuncional, String nome, String email, double salario) {
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
		
	}
	
	public String exibir() {
		return "Funcional " + numeroFuncional + "/"
				+ nome + "\n" + "Email: " + email + " / Salario: R$ " + salario;
		
	}

	public void reajustarSalario(double perc) {
		salario = salario + salario * perc / 100;
	}

	public double calcularimposto() {
		double imposto = 0;
		if (salario <= 2000) {
			imposto = 0;
	}
		else if (salario > 2000 && salario <= 3000) {
			imposto = salario*0.15;	
			//salario = salario - imposto;
						
		}
		else if (salario > 3000 && salario <= 4500) {
			imposto = salario*0.25;
			//salario = salario - imposto;
			
					
		}
		else {
			imposto = 2250;
			//salario = salario - imposto;
			
		}
		 return imposto;
	}

	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}





