
import javax.swing.JOptionPane;

public class Medias{
    public static void main(String[] args) {
        double nota1, nota2, media;
        nota1 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a primeira nota")
        );
        nota2 = Double.parseDouble(
            JOptionPane.showInputDialog("Digite a segunda nota")
        );

        media = (nota1+nota2)/2;
        if (media>=6){
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
        else
           if (media>=3){
            JOptionPane.showMessageDialog(null, "Exame");
        }
        else{
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }
}