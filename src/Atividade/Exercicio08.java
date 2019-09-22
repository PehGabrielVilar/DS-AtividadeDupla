package Atividade;

import javax.swing.*;

public class Exercicio08 {

    public static void main(String[] args) {
        String aux = "";
        double salariob = 0, salariol = 0, aulahora = 0, aulames = 0, desconto = 0;
        try {
            aux = JOptionPane.showInputDialog(null, "Digite o valor da hora de aula");
            aux = aux.replace(",", ".");
            aulahora = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite o número de aulas dadas por mês");
            aux = aux.replace(",", ".");
            aulames = Double.parseDouble(aux);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
            System.exit(0);

        }

        salariob = (aulames * aulahora) * 4.50;
        if (salariob <= 1751.81) {
            desconto = (salariob * 8 / 100);
            salariol = salariob - desconto;
        }
        if (salariob >= 1751.81 && salariob <= 2919.72) {
            desconto = (salariob * 9 / 100);
            salariol = salariob - desconto;
        }
        if (salariob >= 2919.73 && salariob <= 5839.45) {
            desconto = (salariob * 11 / 100);
            salariol = salariob - desconto;
        }

        JOptionPane.showMessageDialog(null, "O salário líquido é de: " + "R$ " + salariol);
    }
}
