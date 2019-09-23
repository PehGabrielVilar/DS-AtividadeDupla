package Atividade;

import javax.swing.*;

public class Exercicio09 {

    public static void main(String[] args) {
        String aux = "";
        double volume = 3.14159, raio = 0, altura = 0;

        try {
            aux = JOptionPane.showInputDialog(null, "Insira o valor do raio:");
            aux = aux.replace(",", ".");
            raio = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Insira o valor da altura:");
            aux = aux.replace(",", ".");
            altura = Double.parseDouble(aux);

            volume = (3.14159 * (raio * 2)) * altura;

            JOptionPane.showMessageDialog(null, "O volume é: " + volume);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
            System.exit(0);
        }
    }
}
