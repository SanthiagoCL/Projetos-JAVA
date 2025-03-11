/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto3;

/**
 *
 * @author Santhiago_24771
 */ 
import javax.swing.JOptionPane;

public class Projeto3 {
   
    public static void main(String[] args) {
        double valor = 10;
        double ValorTributado = valor - (valor * 0.1d);
        JOptionPane.showMessageDialog(null,"O valor de " + valor + "R$ depois de ser tributado " + ValorTributado + "R$");
        
    }
    
}
