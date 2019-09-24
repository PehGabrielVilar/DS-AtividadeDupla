package Atividade;

import javax.swing.*;

public class Exercicio15 {
    public static void main(String[] args) {
        String aux = "";
        int prato = 0, pcal = 0, sobremesa = 0, scal = 0, bebidas = 0, bcal = 0, resultado = 0;
        
        aux = JOptionPane.showInputDialog(null,"Escolha um prato"
                 + "\n 1- Vegetariano"
                 + "\n 2- Peixe"
                 + "\n 3- Frango"
                 + "\n 4- Carne");
        prato = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog(null,"Escolha uma sobremesa"
                + "\n 1- Abacaxi"
                + "\n 2- Sorvete diet"
                + "\n 3- Mouse diet"
                + "\n 4- Mouse chocolate");
        sobremesa = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog(null,"Escolha uma bebida"
                 + "\n 1- Chá"
                 + "\n 2- Suco de laranja"
                 + "\n 3- Suco de melão"
                 + "\n 4- Refrigerante die");
        bebidas = Integer.parseInt(aux);
        switch(prato){
                 case 1:
                     pcal=180;
                     break;
                 case 2:
                     pcal=230;
                     break;
                 case 3:
                     pcal=250;
                     break;
                 case 4:
                     pcal=350;
                     break;
                 default:
                    JOptionPane.showMessageDialog(null, "Insira um valor válido.");
                    System.exit(0);
             }
        switch(sobremesa){
                 case 1:
                     scal=75;
                     break;
                 case 2:
                     scal=110;
                     break;
                 case 3:
                     scal=170;
                     break;
                 case 4:
                     scal=200;
                     break;
                 default:
                    JOptionPane.showMessageDialog(null, "Insira um valor válido.");
                    System.exit(0);
             }
        switch(bebidas){
                 case 1:
                     bcal=20;
                     break;
                 case 2:
                     bcal=70;
                     break;
                 case 3:
                     bcal=100;
                     break;
                 case 4:
                     bcal=65;
                     break;
                 default:
                    JOptionPane.showMessageDialog(null, "Insira um valor válido.");
                    System.exit(0);
             }
            resultado = pcal + scal + bcal;
            JOptionPane.showMessageDialog(null, resultado + "Cal foram consumidas");
    }
}