package Atividade;

import javax.swing.JOptionPane;

public class Exercicio07 {

    public static void main(String[] args) {
        String aux = "";
        double valor = 0, porc = 9, desc = 0, novovalor = 0;

        try {
            aux = JOptionPane.showInputDialog(null, "Insira o valor do produto:");
            aux = aux.replace(",", ".");
            valor = Double.parseDouble(aux);
            

            desc = valor * porc / 100;
            novovalor = valor - desc;

            JOptionPane.showMessageDialog(null, "O novo valor do produto é: " + novovalor);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
            System.exit(0);
        }
    }
}
