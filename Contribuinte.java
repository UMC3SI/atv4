public class Contribuinte {

    private String nome;
    private String CPF;
    private float Salario;
    private float desc_irpf;

    public Contribuinte(float Salario, String nome, String CPF) {
        this.Salario = Salario;
        this.nome = nome;
        this.CPF = CPF;
    }

    public float getDescIrpf() {
        return desc_irpf;
    }

    public void calcularIRPF() {
        if (Salario < 1903.98) {
            desc_irpf = (Salario * 0) ;
        } else if (Salario >= 1903.99 && Salario <= 2826.65) {
            desc_irpf = (Salario * 0.075f) ;
        } else if (Salario >= 2826.66 && Salario <= 3751.05) {
            desc_irpf = (Salario * 0.15f) ;
        } else if (Salario >= 3751.06 && Salario <= 4664.68) {
            desc_irpf = (Salario * 0.225f) ;
        } else {
            desc_irpf = (Salario * 0.275f) ;
        }
    }
}
