package Atividade;

import javax.swing.*;

public class Exercicio10 {
    public static void main(String[] args) {
        String aux = "";
        double tempo = 0, velocidade = 0, distancia = 0, litros = 0, km = 0;
        try {
            aux = JOptionPane.showInputDialog(null, "Quanto tempo foi gasto na viagem?");
            aux = aux.replace(",", ".");
            tempo = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Qual foi a velocidade média?");
            aux = aux.replace(",", ".");
            velocidade = Double.parseDouble(aux);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
            System.exit(0);
        }
        distancia = tempo * velocidade;
        litros = distancia / 12;

        JOptionPane.showMessageDialog(null, "Foram gastos " + litros + " litros de combustível");

    }
}
