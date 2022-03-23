
import java.util.Scanner;


public class EntradaDeDatos {
 
    public static void main (String args []){
        Scanner console = new Scanner(System.in);    
        System.out.println("Escribe tu nombre:");    
        var usuario  = console.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe tu ocupacion ");
        var ocupa = console.nextLine();
        System.out.println("Resultado:" + ocupa + " " + usuario);
        System.out.println("Escribe tu edad");
        //var edad = console.nextInt();

        System.out.println("____________________");
    }
    
}
