
import java.util.Scanner;


public class ConversionesDatos {
    public static void main (String arg []){
        // Convetir tipo string a un tipo int 
        //var edad = "20";
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        // Pedir un dato 
        
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad :");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        var edadtexto = String.valueOf(10);
        System.out.println("edadtexto = " + edadtexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        
    }
    
}
