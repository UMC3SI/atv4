package calculo_IRPF;


public class calculo_IRPF {
    
    public static void main(String[] args) {
        Contribuinte c1 = new Contribuinte("Gustavo", "88888888", 1300f);
        Contribuinte c2 = new Contribuinte("Julia", "77777777", 2150f);
        Contribuinte c3 = new Contribuinte("Leo", "66666666", 3500f);
        Contribuinte c4 = new Contribuinte("Renata", "55555555", 5600f);
        
        c1.imprimir(); // Qual é o desconto de Imposto de Renda sob o salário de R$ 1.300,00? R: R$ 0,00
        c1.calcularSalarioLiq();
        c2.imprimir(); // Qual é o desconto de Imposto de Renda sob o salário de R$ 2.150,00? R: R$ 161,25
        c2.calcularSalarioLiq();
        c3.imprimir(); // Qual é o desconto de Imposto de Renda sob o salário de R$ 3.500,00? R: R$ 525,00
        c3.calcularSalarioLiq();
        c4.imprimir(); // Qual é o desconto de Imposto de Renda sob o salário de R$ 5.600,00? R: R$ 1540,00
        c4.calcularSalarioLiq();
    }
}