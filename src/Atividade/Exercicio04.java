package Atividade;

import javax.swing.*;

public class Exercicio04 {

    public static void main(String[] args) {
        String aux = "";
        double valor = 1, res = 0;
        while (valor > 0) {
            try {
                aux = JOptionPane.showInputDialog(null, "Digite números positivos: "
                        + "\n # Digite um número negativo e sua operação encerrara #");
                valor = Double.parseDouble(aux);
                res += valor;

            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite somente números !");
                System.exit(0);
            } catch (NullPointerException erro) {
                JOptionPane.showMessageDialog(null, "Digite somente números !");
                System.exit(0);
            }
        }
        res = (valor * -1) + res;
        JOptionPane.showMessageDialog(null, "O resultado é: " + res);
    }
}
