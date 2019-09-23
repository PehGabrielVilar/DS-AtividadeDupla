package Atividade;

import javax.swing.*;

public class Exercicio13 {

    public static void main(String[] args) {
        String aux = "";
        double idade = 0;
        int resp = 0;

        for (int i = 1; i <=5; i++ ) {
            aux = JOptionPane.showInputDialog(null, "Digite a idade");
            idade = Double.parseDouble(aux);
            
        }
       if (idade >= 18){
               resp++;   
        }
        JOptionPane.showMessageDialog(null,"A quantidade de maiores de idade é "+ resp  );
    }

}
