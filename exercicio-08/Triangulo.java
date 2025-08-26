import java.util.Scanner;
import javax.swing.JOptionPane;

// Algoritmo para verificar se é um triângulo

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Entre com o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Entre com o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Entre com o valor de c: ");
        c = sc.nextDouble();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
           JOptionPane.showMessageDialog(null,"Estes valores formam um triângulo");
            if ((a == b) && (b == c)) {
                JOptionPane.showMessageDialog(null,"Triângulo Equilátero");
            } else if ((a == b) || (b == c) || (a == c)) {
               JOptionPane.showMessageDialog(null,"Triângulo Isóceles");
            } else {
                JOptionPane.showMessageDialog(null,"Triângulo Escaleno");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Estes valores não formam um triângulo");
        }
        sc.close();
    }
}