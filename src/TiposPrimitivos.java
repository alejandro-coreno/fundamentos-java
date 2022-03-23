    
public class TiposPrimitivos {
    
    public static void main (String args []){
        /*
        Tipos primitivos enteros: byte,short,int,long 
        */
        byte numeroByte = (byte)129 ;
        System.out.println("Valor byte:" + numeroByte);
        System.out.println("Valor Maximo del byte :" + Byte.MAX_VALUE);
        System.out.println("Valor Minimo del bye}:" + Byte.MIN_VALUE);
        
        // Tipos numericos Enteros
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println ("Valor Maximo del short:" + Short.MAX_VALUE);
        System.out.println("Valor Minimo del Short: " + Short.MIN_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println ("Valor Maximo de int :" + Integer.MAX_VALUE);
        System.out.println("Valor Minimo del int : " + Integer.MIN_VALUE);
        
        long numeroLong = 9223372L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor Maximo long " + Long.MAX_VALUE);
        System.out.println("Valor Minimo Long " + Long.MIN_VALUE);
        
        /*
        Tipos Primitivos de tipo flotante: float y double
        
        */
        float numeroFloat =  (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        
        double nombreDouble = 1.7976931348623157E308;
        System.out.println("nombreDouble = " + nombreDouble);
        System.out.println("Valor Maximo double " + Double.MAX_VALUE);
        System.out.println("Valor Minimo double " + Double.MIN_VALUE);
        
    }
    
}
