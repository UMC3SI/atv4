/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Matheus
 */
public class Contribuinte {
    String nome;
    private String cpf;
    private float salario;
    private float desc_irpf;
    private String porc;
    
    public Contribuinte (String nome, String cpf, float salario)
            {
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
     public void setNome(String nome) {
      this.nome = nome;
     }
     public void setCpf(String cpf) {
      this.cpf = cpf;
     }
      public void setSalario(float salario) {
      this.salario = salario;
     }
      
      
    public float calcularSalarioLiq() {
       return this.salario - this.desc_irpf;
    }
    
    public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Salário: " + this.salario);
		System.out.println("Desconto do IRPF: " + this.desc_irpf);
		System.out.println("Salário líquido: " + this.calcularSalarioLiq());
		System.out.println("Desconto aplicado: " + this.porc);
		System.out.println();
		System.out.println("================================");
		System.out.println();
	}
    public void calcularINSS(){
        float caso1 = 1903.98f;
        float caso2 = 2826.65f;
        float caso3 = 3751.05f;
        float caso4 = 4664.68f;
        
        if (this.salario <= caso1) {
        this.desc_irpf = 0;
        }
         if (this.salario <= caso2 && this.salario > caso1 ) {
        this.desc_irpf = this.salario * 7.5f/100f;
        this.porc = "7,5%";
        }
         if (this.salario <= caso3 && this.salario > caso2 ) {
        this.desc_irpf = this.salario * 15f/100f;
         this.porc = "15%";
        }
         if (this.salario <= caso4 && this.salario > caso3 ) {
             
        this.desc_irpf = this.salario * 22.5f/100f;
         this.porc = "22,5%";
        }
         if (this.salario > caso4 ) {
        this.desc_irpf = this.salario * 27.5f/100f;
         this.porc = "27,5%";
        }
        
         
         
         
    
    
    
       

    }
}
        