package Atividade;

import javax.swing.*;

public class Exercicio06 {

    public static void main(String[] args) {
        String aux = "";
        int DD = 0, DDN = 0, MM = 0, MMN = 0, AAAA = 0, AAAAN = 0, resAAAA = 0, resAAAAN = 0, resAAAAM = 0,
                resAAAAQ = 0, resAAAAO = 0, resAAAAP = 0;
        
        aux = JOptionPane.showInputDialog(null, "Insira o dia que estamos");
        DD = Integer.parseInt(aux);
            
        aux = JOptionPane.showInputDialog(null, "Insira o mês que estamos");
        MM = Integer.parseInt(aux);
            
        aux = JOptionPane.showInputDialog(null, "Insira o ano que estamos");
        AAAA = Integer.parseInt(aux);
        
        aux = JOptionPane.showInputDialog(null, "Insira o dia que você nasceu");
        DDN = Integer.parseInt(aux);
            
        aux = JOptionPane.showInputDialog(null, "Insira o mês que você nasceu");
        MMN = Integer.parseInt(aux);
            
        aux = JOptionPane.showInputDialog(null, "Insira o ano que você nasceu");
        AAAAN = Integer.parseInt(aux);
        
        resAAAA = AAAA - AAAAN;
        resAAAAN = resAAAA / 4;
        resAAAAM = resAAAA % 4;
        resAAAAO = 1461 * resAAAAN;
        resAAAAP = 365 * resAAAAM;
        resAAAAQ = resAAAAO + resAAAAP;
        res
         JOptionPane.showMessageDialog(null, resAAAAQ);
    }
   
}
