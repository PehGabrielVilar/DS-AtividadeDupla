package Atividade;

import javax.swing.*;

public class Exercicio11 {

    public static void main(String[] args) {
        String aux = "";
        double senha = 0, senha1 = 0, valor = 0, valor1 = 0, resp = 0;

        try {
            aux = JOptionPane.showInputDialog(null, "Cadastre a senha");
            senha = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Insira o valor");
            valor = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Insira o valor");
            valor1 = Double.parseDouble(aux);

            aux = JOptionPane.showInputDialog(null, "Digite a senha para fazer a operação");
            senha1 = Double.parseDouble(aux);

            if (senha == senha1) {
                resp = valor / valor1;
                JOptionPane.showMessageDialog(null, "A divisão de " + valor + " / "
                        + valor1 + " é igual a: \n" + resp);
            }
            if (senha != senha1) {
                JOptionPane.showMessageDialog(null, "Senha incorreta");
                System.exit(0);
            }
        }catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números !");
            System.exit(0);}
    }
}
