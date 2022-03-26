
public class Application {
	//Bruno Rodrigues  RGM:11211501661
	//Bianca Gomes     RGM:11211101607

	public static void main(String[] args) {

		Contribuinte f1 = new Contribuinte("Matheus", "111.111.111-11", 1300.0f);
		// desconto sob o salário de R$ 1.300,00 = 0.0
		
		Contribuinte f2 = new Contribuinte("João", "222.222.222-22", 2150.0f);
		// desconto sob o salário de R$ 2.150,00 = 161.25
		
		Contribuinte f3 = new Contribuinte("Pedro", "333.333.333-33", 3500.0f);
		// desconto sob o salário de R$ 3.500,00 = 525.0
		
		Contribuinte f4 = new Contribuinte("Marcia", "444.444.444-44", 5600.0f);
		// desconto sob o salário de R$ 5.600,00 = 1540.0

		/* Método imprimir()		
		Nome: nome
		CPF: xxx.xxx.xxx-xx
		Salário: xxxx.x
		Desconto do IRPF: xxxx.xx
		Salário líquido: xxxx.xx
		Desconto aplicado: xx.x
		
		==========================
		*/
		
		f1.imprimir();
		f2.imprimir();
		f3.imprimir();
		f4.imprimir();	
		
		
	}

}
