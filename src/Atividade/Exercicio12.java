package Atividade;

import javax.swing.*;

public class Exercicio12 {
    public static void main(String[] args) {
         String aux = "";
        int num = 0, ant = 0, suc = 0;
        try {
            aux = JOptionPane.showInputDialog(null, "Digite um número inteiro para receber seu antecessor e o seu sucessor");
            num = Integer.parseInt(aux);

            ant = num - 1;
            suc = num + 1;
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números inteiros");
        }
        JOptionPane.showMessageDialog(null, "O antecessor é " + ant + " e o sucessor é " + suc);
    }
}
