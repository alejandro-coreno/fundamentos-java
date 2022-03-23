
public class OperadoresUnarios {
    
    public static void main (String args []){
       // Enteros  
        var a = 3;
        var b = -3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Booleanos 
        var c = true;
        var d = !c; 
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        // Operadores unarios Incremento
        // 1.Preincremento ( Simbolo antes de la variable )
        var e = 3;
        var f = ++e; // Primero se incrementa la variables y despues usa su valor 
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // 2. Postincremento (Simbolo despues de la variable 
        var g = 5;
        var h = g++; // Primero se utiliza el valor y despues se incrementa  
        System.out.println("g = " + g); // Teniamos pendiente el incremento 
        System.out.println("h = " + h);
        
        // Decremento 
        // 1.- Predecremento 
        var i = 2;
        var j = --i;
        System.out.println("i = " + i);// Ya esta decrementada 
        System.out.println("j = " + j);
        
        // 2. Posdecremento 
        
        var k = 4;
        var l = k--; // Primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k);// Tenia pendiente un drecremento
        System.out.println("l = " + l);
        
    }
    
}
