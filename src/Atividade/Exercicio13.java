package Atividade;

import javax.swing.*;

public class Exercicio13 {

    public static void main(String[] args) {
        String aux = "";
        int resp = 0,idade = 0;

        try {
            for (int i = 0; i <= 19; i++) {
                aux = JOptionPane.showInputDialog(null, "Digite a idade");
                idade = Integer.parseInt(aux);
                if (idade >= 18) {
                    resp++;
                }
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números inteiros");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null, "A quantidade de maiores de idade é " + resp);
    }

}
