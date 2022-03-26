public class Contribuinte {

    private String nome;
    private String CPF;
    private float salario;
    private float desc_irpf;
    private float salario_liquido;

    public Contribuinte(float salario, String nome, String CPF) {
        this.salario = salario;
        this.nome = nome;
        this.CPF = CPF;
    }

    public float getDescIrpf() {
        return desc_irpf;
    }

    public void calcularIRPF() {
        if (salario < 1903.98) {
            desc_irpf = (salario * 0);
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            desc_irpf = (salario * 0.075f);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            desc_irpf = (salario * 0.15f);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            desc_irpf = (salario * 0.225f);
        } else {
            desc_irpf = (salario * 0.275f);
        }
    }

    public float calcularSalarioLiq() {
        
        if (salario < 1903.98) {
           salario_liquido  = salario - (salario * 0);
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            salario_liquido  = salario - (salario * 0.075f);
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            salario_liquido = salario - (salario * 0.15f);
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            salario_liquido = salario - (salario * 0.225f);
        } else {
            salario_liquido = salario - (salario * 0.275f);
        }

        return salario_liquido;
    }

    public void imprimir(){
        System.out.println();
        System.out.println("Nome: "+ this.nome);
        System.out.println("CPF: "+ this.CPF);
        System.out.println("Salario: "+ this.salario);
        System.out.println("Desconto: "+ this.desc_irpf);
        System.out.println("Salario Liquido: "+ this.salario_liquido);
    }
}
