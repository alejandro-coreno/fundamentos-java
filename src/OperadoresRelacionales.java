
public class OperadoresRelacionales {

    public static void main(String args[]) {
        var a = 3;
        var b = 4;

        var c = (a >= b);
        System.out.println("c = " + c); // mayor que > o el mayor o igual que >=

        if (a % 2 == 0) {
            System.out.println("Es nuemero par ");
        } else {
            System.out.println("Es numero impar ");
        }
        
        var  edad = 5;
        var adulto = 18;
        
        if ( edad >= adulto){
            System.out.println("Es un adulto ");
        }else {
            System.out.println("Es menor de edad ");
        }
    }

}
