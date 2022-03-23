
import java.util.Scanner;

public class TrianguloTarea {

    public static void main(String args[]) {
        Scanner trian = new Scanner(System.in);
        int altura, ancho, area, peri;
        System.out.println("Proporciona la altura del triangulo:");
        altura = Integer.parseInt(trian.nextLine());
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(trian.nextLine());
        area = altura * ancho;
        peri = (altura + ancho) * 2;
        System.out.println("area = " + area);
        System.out.println("peri = " + peri);

    }

}
