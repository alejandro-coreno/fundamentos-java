
public class HolaMundo {
    public static void main (String args []){
        // Definimos la  variable 
       int miVariableEntera = 10;
       System.out.println(miVariableEntera);
       // Modificamos el valor de la variable 
       miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        // Definimos la variable cadena 
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        // Modificamos la variable 
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        // Var - Inferencia de tipos de java
       
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        
        // Var tipo cadena
        
        var mivariableCadena2 = "Nueva Cadena";
        System.out.println (mivariableCadena2);
        
        // Valores permitidos en el nombre de variables 
        
        var miVariable = 1;
        var _mivariable = 2;
        var $mivariable = 3;
        // var #miVariable = 2 ; No se recomienda utilizar caracteres especiales     
        
    }
}
