import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploThrows {

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try{
            System.out.println("Digite um numero");
            int numerador = leitor.nextInt();
            System.out.println("Digite outro numero");
            int denominador = leitor.nextInt();
            System.out.println(numerador + "/" + denominador + "=" + divide(numerador,denominador));
        } catch (ArithmeticException err){
            System.out.println("Divisão por zero");
            err.printStackTrace();
        } catch (InputMismatchException err){
            System.out.println("Só é permitido inteiros");
            err.printStackTrace();
        }
    }
}
