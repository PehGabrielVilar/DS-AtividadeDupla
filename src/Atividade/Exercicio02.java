package Atividade;

import javax.swing.*;

public class Exercicio02 {

    public static void main(String[] args) {
        String aux = "";
        double sbruto = 0, prest = 0, res = 0;

        try {
            aux = JOptionPane.showInputDialog(null, "Digite o seu salário bruto: ");
            aux = aux.replace(",", ".");
            sbruto = Double.parseDouble(aux);
            

            aux = JOptionPane.showInputDialog(null, "Digite o valor da prestação do empréstimo: ");
            aux = aux.replace(",", ".");
            prest = Double.parseDouble(aux);
            

            res = prest /(sbruto / 100); 
            
            if (res >= 0 && res <= 30) {
                JOptionPane.showMessageDialog(null, "Empréstimo pode ser concedido.");
            }
            if (res > 30) {
                JOptionPane.showMessageDialog(null, "Empréstimo não pode ser concedido.");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
        }

    }

}
