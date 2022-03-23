
public class OperadoresAritmeticos {
    
    public static void main (String args []){
        int a=3, b=2;
        var resultado = a + b ;
        System.out.println("resultado Suma = " + resultado);
        
        resultado = a - b ;
        System.out.println("resultado Resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado Multiplicacion = " + resultado);
        
        var resultado2 = 3.0d/b;
        System.out.println("resultado2 division  = " + resultado2);
        
        resultado = a % b ;
        System.out.println("resultado Modulo  = " + resultado);
        
        if (b % 2 == 0){
            System.out.println("Es numero par ");
        }else{
            System.out.println("Es numero inpar ");
        }
    }
    
}