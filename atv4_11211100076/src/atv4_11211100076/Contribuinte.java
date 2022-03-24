package atv4_11211100076;

public class Contribuinte {
	
	private String nome;
	private String cpf;
	private float salario;
	private float desc_irpf;
	
	public Contribuinte(String nome,String cpf, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public float getSalario() {
		return salario;
	}
	public float getDesc_irpf() {
		return desc_irpf;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void calcularIrpf() {
		if(salario <= 1903.98f) {
			desc_irpf = salario * 0;
			System.out.println(desc_irpf);
			
		}else if(salario <= 2826.65f) {
			desc_irpf = salario * 0.075f;
			System.out.println(desc_irpf);
			
		}else if(salario <= 3751.05) {
			desc_irpf = salario * 0.15f;
			System.out.println(desc_irpf);
			
		}else if(salario <= 4664.68f) {
			desc_irpf = salario * 0.225f;
			System.out.println(desc_irpf);
			
		}else if(salario > 4664.68f) {
			desc_irpf = salario * 0.275f;
			System.out.println(desc_irpf);
			
		}
	}
	public float calcularSalarioLiq() {
			return salario - desc_irpf;
		}
	public void imprimir() {
		System.out.println("Seu nome: " + nome);
		System.out.println("Seu CPF: " + cpf);
		System.out.println("Seu salario: " + salario);
		System.out.println("Desconto: " + desc_irpf);
		
	}

}
/*
Qual é o desconto de Imposto de Renda sob o salário de R$ 1.300,00?
O desconto é 0.0

Qual é o desconto de Imposto de Renda sob o salário de R$ 2.150,00?
O desconto é 161.25

Qual é o desconto de Imposto de Renda sob o salário de R$ 3.500,00?
O desconto é 525.0

Qual é o desconto de Imposto de Renda sob o salário de R$ 5.600,00?
O desconto é 1540.0

Leonardo Piascentini Bugmann – 11211100076 
Renata Cristina da Silva – 11211100766 
Lucas da Silva Cardoso – 11211102438 
*/
