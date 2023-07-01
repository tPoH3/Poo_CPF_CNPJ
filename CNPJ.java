/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.validarcpfcnpj;

import static sp.senai.br.validarcpfcnpj.CPF.primeiroDigito;
import static sp.senai.br.validarcpfcnpj.CPF.segundoDigito;

/**
 *
 * @author aluno
 */
public class CNPJ {
    public static int primeiroDigito(int[] numeros){
        int[] multiplicadores = {5,4,3,2,9,8,7,6,5,4,3,2};
        int soma      = 0;
        int resultado = 0;
        
        for (int i = 0; i < multiplicadores.length; i++) {
            soma += numeros[i] * multiplicadores[i];
        }
            
            resultado = 11 - (soma % 11);
            
            if((resultado == 10 ) || (resultado == 11)){
            return 0;
            }
            
        return resultado;
        
    }
    public static int segundoDigito(int[] numeros){
        int[] multiplicadores = {5,4,3,2,9,8,7,6,5,4,3,2};
        int soma      = 0;
        int resultado = 0;
        
        for (int i = 0; i < multiplicadores.length; i++) {
            soma += numeros[i] * multiplicadores[i];
        }
            
            resultado = 11 - (soma % 11);
            
            if((resultado == 10 ) || (resultado == 11)){
            return 0;
            }
            
        return resultado;
        
    }
    
    public static boolean validar(String cnpj) {
      
        if (cnpj.length() != 11) {
            return false;
        }
        
        int[] numeros = new int[11];
      
        for (int i = 0; i < 11; i++) {
            numeros[i] = Integer.parseInt(cnpj.substring(i, i + 1));
        }
        
        if(primeiroDigito(numeros) != numeros[9] || segundoDigito(numeros) != numeros[10]){
            return false;
        }
        
        return true;
    }
    
}
