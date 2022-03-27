package atv4_11211100076;

public class Main {
	public static void main(String[] args) {
		Contribuinte c1 = new Contribuinte("Leo","12234567",1300);
		Contribuinte c2 = new Contribuinte("Gustavo","7643912",2150);
		Contribuinte c3 = new Contribuinte("Julia","91426485",3500);
		Contribuinte c4 = new Contribuinte("Lucas","63547118",5600);
		c1.calcularIrpf();
		System.out.println(c1.calcularSalarioLiq());
		c1.imprimir();
		System.out.println(" ");
		c2.calcularIrpf();
		System.out.println(c2.calcularSalarioLiq());
		c2.imprimir();
		System.out.println(" ");
		c3.calcularIrpf();
		System.out.println(c3.calcularSalarioLiq());
		c3.imprimir();
		System.out.println(" ");
		c4.calcularIrpf();
		System.out.println(c4.calcularSalarioLiq());
		c4.imprimir();
	}
}
/*
Qual � o desconto de Imposto de Renda sob o sal�rio de R$ 1.300,00?
O desconto � 0.0

Qual � o desconto de Imposto de Renda sob o sal�rio de R$ 2.150,00?
O desconto � 161.25

Qual � o desconto de Imposto de Renda sob o sal�rio de R$ 3.500,00?
O desconto � 525.0

Qual � o desconto de Imposto de Renda sob o sal�rio de R$ 5.600,00?
O desconto � 1540.0

Leonardo Piascentini Bugmann � 11211100076 
Renata Cristina da Silva � 11211100766 
Lucas da Silva Cardoso � 11211102438 
*/
