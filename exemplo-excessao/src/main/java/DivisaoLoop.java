import javax.swing.*;

public class DivisaoLoop {
    public static void main(String[] args) {
        boolean fim = false;
        String snum1, snum2;
        do {
            snum1 = JOptionPane.showInputDialog("Digite um número");
            snum2 = JOptionPane.showInputDialog("Digite outro número:");
            try {
                int num1 = Integer.parseInt(snum1);
                int num2 = Integer.parseInt(snum2);
                JOptionPane.showMessageDialog(null, num1/num2);
                fim = true;
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
            }
        } while (!fim);

    }
}
