/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contribuinte;

/**
 *
 * @author alunocmc
 */
public class Contribuinte {
    private String nome;
    private String cpf;
    private float salario;
    private float desc_irpf;
    private double aliquota;
    
    public Contibuinte(nome,cpf,salario,)
    {
       
    }
    public void calcirpf()
    { 
        if (salario<1903.98)
        {
            desc_irpf = (salario*0)-salario;
        }
        else if(salario>1903.98||salario<2826.65)
             {
            desc_irpf = (salario*0.075f)-salario;
             }
        else if(salario>2826.65||salario<3751.05)
             {
            desc_irpf = (salario*0.15f)-salario;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
}
