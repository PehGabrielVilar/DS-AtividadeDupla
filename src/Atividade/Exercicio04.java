package Atividade;

import javax.swing.*;

public class Exercicio04 {

    public static void main(String[] args) {
        String aux = "";
        double num0 = 0, num1 = 0, num2 = 0, num3 = 0, resp = 0;

        try {
            
            if (num0 >= 0 && num1 >= 0 && num2 >= 0 && num3 >= 0){
            aux = JOptionPane.showInputDialog(null, "");
            num0 = Double.parseDouble(aux);
            aux = aux.replace(",", ".");

            aux = JOptionPane.showInputDialog(null, "");
            num1 = Double.parseDouble(aux);
            aux = aux.replace(",", ".");

            aux = JOptionPane.showInputDialog(null, "");
            num2 = Double.parseDouble(aux);
            aux = aux.replace(",", ".");

            aux = JOptionPane.showInputDialog(null, "");
            num3 = Double.parseDouble(aux);
            aux = aux.replace(",", ".");

            resp = num0 + num1 + num2 + num3;

            JOptionPane.showMessageDialog(null, "A soma dos números é: " + resp);  
            }

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");

        }
    }
}
