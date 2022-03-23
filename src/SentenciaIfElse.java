
public class SentenciaIfElse {

    public static void main(String args[]) {
        var condicion = true;

        if (condicion) {
            System.out.println("Condicion verdadera");
            System.out.println("Nueva linea ");
        } else {
            System.out.println("Condicion falsa");
        }

        // Ejercicio if y else if 
        var numero = 1;
        var numeroTexto = "";

        if (numero == 1) {
            numeroTexto = "Numero uno ";
        } else if (numero == 2) {
            numeroTexto = "Numero dos ";
        } else if (numero == 3) {
            numeroTexto = "Numero tres ";
        } else if (numero == 4) {
            numeroTexto = "numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        var mes = 15;
        var estacion = "Estacion desconocida ";
        
        if ( ( mes == 1 ) || (mes == 2 )|| ( mes ==12 )){
            estacion = "Invierno";
        }
        else if ( (mes == 3) || ( mes == 4 ) || ( mes == 5 ) ){
            estacion = "Primavera";
        }
        else if (( mes == 6) || ( mes == 7 ) || ( mes == 8 ) ){
            estacion = "Verano";
        }
        else if (( mes == 9 ) || ( mes == 10 ) || ( mes == 11 )){
            estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);
    }   
    

}
