package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 =  new Persona();
        persona1.nombre = " Josue Alejandro ";
        persona1.apellido = " Coreno ";
        persona1.desplegarInformacion();
                
        Persona Persona2 = new Persona();
        
        System.out.println("Persona2 = " + Persona2);
        System.out.println("persona1 = " + persona1);
        
        Persona2.desplegarInformacion();
        
        Persona2.nombre = " Karla ";
        Persona2.apellido = " Lara ";
        
                
        
       
        
    }
}
