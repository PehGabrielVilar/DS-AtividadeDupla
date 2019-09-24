package Atividade;

import javax.swing.*;

public class Exercicio14 {

    public static void main(String[] args) {
        String Resposta = "", nome = "", nome2 = "";
        int idade = 0, idade2 = 0;

        try {
            nome2 = JOptionPane.showInputDialog(null, "Digite seu nome: ");
            Resposta = JOptionPane.showInputDialog(null, "Digite sua idade: ");
            idade2 = Integer.parseInt(Resposta);
            Resposta = maisNovo(idade, idade2, nome, nome2, Resposta);
            JOptionPane.showMessageDialog(null, Resposta);

        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente números inteiros");
            System.exit(0);
        } catch (NullPointerException error) {
            JOptionPane.showMessageDialog(null, "Você encerrou o programa.");
            System.exit(0);
        }
         
    
    }
    public static String maisNovo(int idade, int idade2, String nome, String nome2, String Resposta) {
        for (int x = 0; x < 9; x++) {
            nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
            Resposta = JOptionPane.showInputDialog(null, "Digite sua idade: ");
            idade = Integer.parseInt(Resposta);
            if (idade < idade2) {
                nome2 = nome;
                idade2 = idade;
            }
        }
        return nome2 + " com " + idade2 + " ano(s), é a pessoa com a menor idade";

    }

}
