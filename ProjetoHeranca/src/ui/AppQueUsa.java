
package ui;
import core.Estudante;
import core.Pessoa;

public class AppQueUsa {

	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa();
		
		p.setNome ("Joao");
		p.setEmail ("joao@itau.com.br");
		p.exibir();
		
		Estudante e = new Estudante();
		e.setCurso ("Computa");
		e.setNome ("joao");
		e.setEmail ("joao@itau.com.br");
		
		e.exibir();
		e.setNumeroMatricula (1234);
	}
}
