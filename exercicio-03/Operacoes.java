//Operaçoẽs Aritméticas

import javax.swing.JOptionPane;

public class Operacoes {
    public static void main(String[] args) {
        int num1, num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog(
            "Digite um número"));
        num2=Integer.parseInt(JOptionPane.showInputDialog(
            "Digite outro número"));
        JOptionPane.showMessageDialog(null, "Soma: " + (num1+num2));
        JOptionPane.showMessageDialog(null, "Subtração: " + (num1-num2));
        JOptionPane.showMessageDialog(null, "Multiplicação: " + (num1*num2));
        JOptionPane.showMessageDialog(null, "Divisão: " + (num1/num2));
        JOptionPane.showMessageDialog(null, "Resto: " + (num1%num2));
    }
}
