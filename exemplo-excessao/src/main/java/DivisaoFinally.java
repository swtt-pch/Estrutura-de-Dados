import javax.swing.*;

public class DivisaoFinally {
    public static void main(String[] args) {
        String snum1, snum2;
        snum1 = JOptionPane.showInputDialog("Digite um número");
        snum2 = JOptionPane.showInputDialog("Digite outro número:");
        try {
            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);
            JOptionPane.showMessageDialog(null, num1/num2);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
                    "Divisão por zero!\n" + e,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    "Digite Apenas números!\n\n" + e,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "fim do processamento");
            System.exit(0);
        }
    }
}
