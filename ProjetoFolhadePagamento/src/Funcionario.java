
public class Funcionario {
	public static void main(String[] args) {

		FolhadePagamento f1, f2, f3;

		f1 = new FolhadePagamento(12345, "Paranoid ", "paranoid@itau.com.br", 2300.00);
		f2 = new FolhadePagamento(45678, "Sabbath Bloody ", "sabbloody@itau.com.br", 1990.00);
		f3 = new FolhadePagamento(78909, "Motorhead ", "motorhead@itau.com.br", 9000.00);

//		f1.setNumeroFuncional(12345);
//		f1.setNome("Paranoid");
//		f1.setEmail("paranoid@itau.com.br");
//		f1.setSalario(2300);
//
//		f2.setNumeroFuncional(45678);
//		f2.setNome("Sabbath Bloody");
//		f2.setEmail("sabbloody@itau.com.br");
//		f2.setSalario(1990);
//
//		f3.setNumeroFuncional(6666);
//		f3.setNome("Motorhead");
//		f3.setEmail("motorhead@itau.com.br");
//		f3.setSalario(9000);

		System.out.println("----------Salario Sem Reajuste------------");
		System.out.println(f1.exibir());
		System.out.println(f2.exibir());
		System.out.println(f3.exibir());

		f1.reajustarSalario(10);
		f2.reajustarSalario(15);
		f3.reajustarSalario(8);

		System.out.println("----------Salario com Reajuste------------");
		System.out.println(f1.exibir());
		System.out.println(f2.exibir());
		System.out.println(f3.exibir());

		System.out.println("----------Valores de Impostos Descontados------------");
		System.out.println("R$ " + f1.calcularimposto());
		System.out.println("R$ " + f2.calcularimposto());
		System.out.println("R$ " + f3.calcularimposto());
	}

}
