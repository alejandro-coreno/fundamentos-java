

public class EstacionesSwitch {
    
    public static void main (String args []){
       int mes = 4;
       var  mesTexto = "Estacion desconocida ";
        
       switch (mes){
           case 1 : case 2: case 12:
               mesTexto = "Invierno";
               break;
           case 3 : case 4: case 5:
               mesTexto = "Primavera";
               break;
           case 6 : case 7: case 8: 
               mesTexto = "Verano";
               break;
           case 9: case 10: case 11:
               mesTexto = "Invierno";
               break;
           default :
               mesTexto = "Mes Incorrecto";
       }
        
        System.out.println("mesTexto = " + mesTexto);
    
    }
    
}
