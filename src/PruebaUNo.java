
import java.util.Scanner;


public class PruebaUNo {
    
    
    public static void main(String[] args) {
        int opc  ;
        double num1 , num2 , Operacion ;
        
        Scanner Datos = new Scanner(System.in);
        System.out.println("Calculadora Basica");
        System.out.println("1.- Suma ");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion ");
        System.out.println("4.- Division ");
        System.out.println("¿Que operacion deseas realizar");
        opc = Datos.nextInt();
        
        switch (opc){
            case 1: 
                System.out.println("\t Suma ");
                System.out.println("\n Ingrese El primer digito");
                num1 = Datos.nextDouble();
                System.out.println("Ingrese el Segundo Digito");
                num2 = Datos.nextDouble();
                Operacion = num1 + num2; 
                System.out.println("La Suma es de : " + Operacion ); break;
            case 2:
                System.out.println("\t Resta ");
                System.out.println("\n Ingrese El primer digito");
                num1 = Datos.nextDouble();
                System.out.println("Ingrese el Segundo Digito");
                num2 = Datos.nextDouble();
                Operacion = num1 - num2; 
                System.out.println("La Resta es de : " + Operacion ); break;
        }
        
    }

        
}
