package Atividade;

import javax.swing.*;

public class Exercicio08 {

    public static void main(String[] args) {
        String aux = "";
        double aulahora = 0, aulames = 0, sbruto = 0, sliquido = 0, desconto = 0;
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o valor da hora de aula");
            aux = aux.replace(",", ".");
            aulahora = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite o número de aulas dadas por mês");
            aux = aux.replace(",", ".");
            aulames = Double.parseDouble(aux);

            sbruto = aulahora * aulames;

            if (sbruto <= 1121.45) {
                desconto = sbruto * 8 / 100;
                sliquido = sbruto - desconto;
            }
            if (sbruto > 1121.45 && sbruto <= 1954.89) {
                desconto = sbruto * 9 / 100;
                sliquido = sbruto - desconto;
            }
            if (sbruto > 1954.89 && sbruto <= 2639.45) {
                desconto = sbruto * 11 / 100;
                sliquido = sbruto - desconto;
            }
            if (sbruto > 2639.45) {
                desconto = sbruto * 11 / 100;
                sliquido = sbruto - desconto;
            }

            JOptionPane.showMessageDialog(null, "O salário líquido é de: " + "R$ " + sliquido);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
            System.exit(0);

        }

    }
}
