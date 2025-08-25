//Quadrado de um número

import javax.swing.*;

public class QuadradoNumero {
    public static void main (String [] args) {
        int q, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número"));
        q = n*n;
        JOptionPane.showMessageDialog( null, "O quadrado de " + n + " é " + q);
    }
}