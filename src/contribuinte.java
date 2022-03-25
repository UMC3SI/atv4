package calculo_IRPF;


public class Contribuinte {
    private String nome;
    private String cpf;
    private float salario;
    private float desc_irpf;
    private float aliquota;
    
    public Contribuinte(String nome, String cpf, float salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        calcularIRPF();
    }
    
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public double getSalario(){
        return salario;
    }

    public double getAliquota(){
        return salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalario(float salario){
        this.salario = salario;
        calcularIRPF();
    }
    
    public void calcularIRPF(){
        float faixa1 = 1903.98f;
        float faixa2 = 2826.65f;
        float faixa3 = 3751.05f;
        float faixa4 = 4664.68f;
        if (salario <= faixa1){
            aliquota = 0;
            desc_irpf = salario * (aliquota / 100); 
        } else if(salario <= faixa2) {
            aliquota = 7.5f;
            desc_irpf = salario * (aliquota / 100); 
        } else if(salario <= faixa3) {
            aliquota = 15f;
            desc_irpf = salario * (aliquota / 100); 
        } else if(salario <= faixa4) {
            aliquota = 22.5f;
            desc_irpf = salario * (aliquota / 100);  
        } else{
            aliquota = 27.5f;
            desc_irpf = salario * (aliquota / 100);      
        }
    }
    
    public float calcularSalarioLiq(){
        return salario - desc_irpf;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Desconto: R$ " + desc_irpf);
        System.out.println("Aliquota IRPF: " + aliquota + "%");
    }
}