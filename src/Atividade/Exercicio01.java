package Atividade;

import javax.swing.*;

public class Exercicio01 {

    public static void main(String[] args) {
        String aux = "";
        double valor = 0, porc = 0, salario = 0, aum = 0;

        try {
            aux = JOptionPane.showInputDialog(null, "Insira o seu salário:");
            aux = aux.replace(",", ".");
            valor = Double.parseDouble(aux);            

            aux = JOptionPane.showInputDialog(null, "Insira o percentual de aumento:");
            aux = aux.replace(",", ".");
            porc = Double.parseDouble(aux);

            if (valor < 300.00) {
                JOptionPane.showMessageDialog(null, "Valor Invalido");
                System.exit(0);
            }
            if (valor >= 300.00 && valor < 750.00) {
                salario = valor + (valor * porc / 100);
                aum = valor * porc / 100;
            }
            if (valor >= 750.00 && valor < 1200.00) {
                salario = valor + (valor * porc / 100);
                aum = valor * porc / 100;
            }
            if (valor >= 1200.00 && valor < 1650.00) {
                salario = valor + (valor * porc / 100);
                aum = valor * porc / 100;
            }
            if (valor >= 1650.00 && valor < 2550.00) {
                salario = valor + (valor * porc / 100);
                aum = valor * porc / 100;
            }
            if (valor >= 2550.00 && valor < 3450.00) {
                salario = valor + (valor * porc / 100);
                aum = valor * porc / 100;
            }
            if (valor >= 3450.00) {
                JOptionPane.showMessageDialog(null, "Esse valor não recebe aumento!");
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "O valor do aumento é: " + aum
                    + "\n " + "O seu novo salário é: " + salario);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
        }

    }

}
