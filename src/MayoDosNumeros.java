
import java.util.Scanner;

public class MayoDosNumeros {

    public static void main(String args[]) {
        Scanner numero = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un numero ");
        num1 = Integer.parseInt(numero.nextLine());
        System.out.println("Ingrese el segundo numero");
        num2 = Integer.parseInt(numero.nextLine());
        if (num1 > num2) {
            System.out.println("El numero mayo es: " + num1);
        } else {
            System.out.println("El numero mayo es: " + num2);
        }

    }

}
