public class Main {
    public static void main(String[] args) {

        Contribuinte contrA = new Contribuinte(1300f, "Cleiton", "521.845.321-10");
        Contribuinte contrB = new Contribuinte(2150f, "Caio", "254.485.301-12");
        Contribuinte contrC = new Contribuinte(3500f, "Guilherme", "021.325.141-08");
        Contribuinte contrD = new Contribuinte(5600f, "Gustavo", "421.135.348-35");

        contrA.calcularIRPF();
        System.out.println("imposto de renda do salário R$1300: "+contrA.getDescIrpf());
        
        contrB.calcularIRPF();
        System.out.println("imposto de renda do salário R$2150: "+contrB.getDescIrpf());
        
        contrC.calcularIRPF();
        System.out.println("imposto de renda do salário R$3500: "+contrC.getDescIrpf());
        
        contrD.calcularIRPF();
        System.out.println("imposto de renda do salário R$5600: "+contrD.getDescIrpf());
    }

}
