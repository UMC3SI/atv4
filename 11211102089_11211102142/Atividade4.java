/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade4;

/**
 *
 * @author Matheus
 */
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Contribuinte funcionario1 = new Contribuinte("Bruno lindo","515.103.992-35",1300.0f);
        Contribuinte funcionario2 = new Contribuinte("Caua","024.113.900-49",2150.0f);
        Contribuinte funcionario3 = new Contribuinte("Alan","025.159.835-12",3500.0f);
        Contribuinte funcionario4 = new Contribuinte("Fabio","094.041.924-91",5600.0f);
        
         System.out.println();
        funcionario1.calcularINSS();
        System.out.println("Nome :" + funcionario1.getNome() +
                " / CPF : " + funcionario1.getCpf() +
                " / Salario Liquido :" + funcionario1.calcularSalarioLiq()
      );
        // resultado da questão Qual é o desconto de Imposto de Renda sob o salário de R$ 1.300,00? RESPOSTA : R$0
        
        System.out.println();
        funcionario2.calcularINSS();
        System.out.println("Nome :" + funcionario2.getNome() +
                " / CPF : " + funcionario2.getCpf() +
                " / Salario Liquido :" + funcionario2.calcularSalarioLiq()
      );
        // resultado da questão Qual é o desconto de Imposto de Renda sob o salário de R$ 2.150,00? RESPOSTA : R$161,25
       
        System.out.println();
        funcionario3.calcularINSS();
        System.out.println("Nome :" + funcionario3.getNome() +
                " / CPF : " + funcionario3.getCpf() +
                " / Salario Liquido :" + funcionario3.calcularSalarioLiq()
      );
        // resultado da questão Qual é o desconto de Imposto de Renda sob o salário de R$ 3.500,00? RESPOSTA : R$525,00
        
        System.out.println();
        funcionario4.calcularINSS();
        System.out.println("Nome :" + funcionario4.getNome() +
                " / CPF : " + funcionario4.getCpf() +
                " / Salario Liquido :" + funcionario4.calcularSalarioLiq()
      );
        // resultado da questão Qual é o desconto de Imposto de Renda sob o salário de R$ 5.600,00? RESPOSTA : R$1540,00
        
       funcionario2.imprimir();
    }
    
}
