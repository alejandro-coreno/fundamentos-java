
public class SentenciaSwitch {
   
    public static void main (String args[]){
        int  numero =4 ;
        var numeroTexto = "valor desconocido";
        
        switch (numero){
            case 1:
                numeroTexto = "Numero uno ";
                break;
            case 2:
                numeroTexto = "Numero dos ";
                break;
            case 3:               
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro ";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    
    
    }
    
    
}
