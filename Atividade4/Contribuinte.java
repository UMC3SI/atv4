
public class Contribuinte {
	
    private String nome;
    private String cpf;
    private float salario;
    private float desc_irpf;
    private String porc;
    
    public Contribuinte(String nome, String cpf, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.calcularINSS();
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	/*
	Base de cálculo Alíquota 
	Até R$ 1.903,98--------------------0%
	De R$ 1.903,99 até R$ 2.826,65-----7,5%
	De R$ 2.826,66 até R$ 3.751,05-----15%
	De R$ 3.751,06 até R$ 4.664,68-----22,5%
	Acima de R$ 4.664,68---------------27,5%
	*/
	
	public void calcularINSS(){
        float faixa1 = 1903.98f;
        float faixa2 = 2826.65f;
        float faixa3 = 3751.05f;
        float faixa4 = 4664.68f;
        
        if (this.salario <= faixa1){
            this.desc_irpf = 0;
            this.porc = "0%%";
        } 
        else if (this.salario <= faixa2) {
        	this.desc_irpf = this.salario * 0.075f;
        	this.porc = "7,5%%";
        } 
        else if (this.salario <= faixa3) {
        	this.desc_irpf = this.salario * 0.15f;
        	this.porc = "15%%";
        } 
        else if (this.salario <= faixa4) {
        	this.desc_irpf = this.salario * 0.225f;
        	this.porc = "22,5%%";
        } 
        else {
        	this.desc_irpf = this.salario * 0.275f;
        	this.porc = "27,5%%";
        }
    }
	
	public float calcularSalarioLiq() {
		return this.salario - this.desc_irpf;
	}
	
	public void imprimir() {
		System.out.printf("Nome: " + this.nome
				+ "\nCPF: " + this.cpf
				+ "\nSalário: " + this.salario
				+ "\nDesconto do IRPF: " + this.desc_irpf
				+ "\nSalário líquido: " + this.calcularSalarioLiq()
				+ "\nDesconto aplicado: " + this.porc
				+ "\n\n==========================\n\n");
	}
	
//	public void imprimir() {
//		System.out.println("Nome: " + this.nome);
//		System.out.println("CPF: " + this.cpf);
//		System.out.println("Salário: " + this.salario);
//		System.out.println("Desconto do IRPF: " + this.desc_irpf);
//		System.out.println("Salário líquido: " + this.calcularSalarioLiq());
//		System.out.println("Desconto aplicado: " + this.porc);
//		System.out.println();
//		System.out.println("================================");
//		System.out.println();
//	}
}
