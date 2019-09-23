package Atividade;

import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {
        String aux = "";
        int i = 5, j, k;
        j = --i;
        k = i++;
        i+= 10;
        JOptionPane.showMessageDialog(null, "o valor de i: "+ i + 
                "\n o valor de j: "+ j +
                "\n o valor de k: "+ k );
    }
}
