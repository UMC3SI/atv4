package calculo_IRPF;


public class calculo_IRPF {
    
    public static void main(String[] args) {
        
        Contribuinte c1 = new Contribuinte("Matheus", "601480544", 1300f);
        Contribuinte c2 = new Contribuinte("Lucas", "71741328", 2150f);
        Contribuinte c3 = new Contribuinte("Leo", "7878462", 3500f);
        Contribuinte c4 = new Contribuinte("Demetrius", "00000000", 5600f);
        
        c1.imprimir(); // 1. Qual é o desconto de Imposto de Renda sob o salário de R$ 1.300,00? R: R$ 0,00
        c1.calcularSalarioLiq();

        c2.imprimir(); // 2. Qual é o desconto de Imposto de Renda sob o salário de R$ 2.150,00? R: R$ 161,25
        c2.calcularSalarioLiq();

        c3.imprimir(); // 3. Qual é o desconto de Imposto de Renda sob o salário de R$ 3.500,00? R: R$ 525,00
        c3.calcularSalarioLiq();

        c4.imprimir(); // 4. Qual é o desconto de Imposto de Renda sob o salário de R$ 5.600,00? R: R$ 1540,00
        c4.calcularSalarioLiq();
    }
}