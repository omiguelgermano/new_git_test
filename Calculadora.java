import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int num1 = s.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2 = s.nextInt();

        double soma =num1+num2;

        System.out.println("A soma foi " + soma);



        s.close();
    }
}
