/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Santhiago_24771
 */ 
import javax.swing.JOptionPane;

public class Projeto4 {
   
    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor base do produto: "));
        if(x!=0){
          double z = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade desse produto "));
          double valorTotal = x * z;
          if (z!=0){
              int y = JOptionPane.showConfirmDialog(null ,"Será aplicado um imposto de 7% \nDeseja continuar?");
              if (y==0){
                  double imposto = (7. / 100)*valorTotal;
                  double valorImposto = valorTotal + imposto;
                  JOptionPane.showMessageDialog(null, "O valor base dos produtos é R$ " + valorTotal + ", e após a aplicação do imposto, passou a ser R$ " + valorImposto);
              } else{
                  JOptionPane.showMessageDialog(null, "Programa encerrado ");
              }
                  
              }
          }
        
        
    }
    
}
