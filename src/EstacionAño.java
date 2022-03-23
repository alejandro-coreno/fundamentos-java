
import java.util.Scanner;


public class EstacionAño {
    
    public static void main (String args []){
        
        Scanner Leer = new Scanner (System.in);
        int mes;
        System.out.println("Calculo de estaciones ");
        System.out.println("\nDigite el numero de mes que deseas: ");
        mes = Leer.nextInt();
        
        if (mes == 1 || mes == 2 || mes == 12){
            System.out.println("Invierno");
        }
        else if ( mes == 3 || mes == 4 || mes == 5 ){
            System.out.println("Primavera");
        }
        else if (mes == 6 || mes == 7 || mes == 8 ){
            System.out.println("Verano");
        }
        else if (mes == 9 || mes == 10 || mes == 11 ){
            System.out.println("Otoño");
        }
        else{
            System.out.println("Mes incorrecto");
        }
       
    }
    
}
