
public class OperadoresTernarios {

    public static void main(String arg[]) {
        var resultado = (1 > 2) ? " Verdadero " : " Falso ";
        System.out.println("resultado = " + resultado);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ?  "Numero par " : "Numero impar" ;
        System.out.println("resultado = " + resultado);
    }

}
