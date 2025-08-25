
import javax.swing.JOptionPane;

// Volume de um Cilindro

public class VolumeCilindro {
    public static void main(String[] args) {
        double h, r, v;
        double pi = 3.1415;
        r = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do raio:"));
        h = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da altura:"));
        v = pi * r * r * h;
        JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + v);
    }
}
