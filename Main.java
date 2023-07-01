/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.validarcpfcnpj;

import java.util.Scanner;
import static sp.senai.br.validarcpfcnpj.CPF.primeiroDigito;

/**
 *
 * @author aluno
 */
public class Main {
    
     public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        
        int continuar;
        
         System.out.println("Digite a opcao que vc deseja validar: 1 - Para CPF ou 2 - para CNPJ");
         continuar=teclado.nextInt();
         if (continuar == 1){
        System.out.print("Digite o CPF a ser validado: ");
        String cpf = teclado.nextLine();
        
        CPF validarCpf = new CPF();
        
        if (validarCpf.validar(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
         }
         
         else {
             System.out.print("Digite o CNPJ a ser validado: ");
            String cnpj = teclado.nextLine();
             CNPJ  validarCnpj = new CNPJ();
             
             
         if (validarCnpj.validar(cnpj)) {
            System.out.println("CNPJ válido!");
        } else {
            System.out.println("CNPJ inválido!");
        }
         }
    }
     
     
}
