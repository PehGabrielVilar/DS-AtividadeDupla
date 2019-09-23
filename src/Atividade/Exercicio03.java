package Atividade;

import javax.swing.*;

public class Exercicio03 {

    public static void main(String[] args) {
        String aux = "";
        double raio = 0, pi = 3.1416, resp = 0;

        try {
            aux = JOptionPane.showInputDialog(null, "Informe o tamanha do raio da circunferência: ");
            aux = aux.replace(",", ".");
            raio = Double.parseDouble(aux);
            

            resp = 2 * pi * raio;

            JOptionPane.showMessageDialog(null, "O tamanho do perímetro é: " + resp);
        }catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
        }

    }

}
