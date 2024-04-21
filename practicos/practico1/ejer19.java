import java.util.*;
public class ejer19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cadena = new ArrayList<String>();
        String palabra;
        do {
            System.out.println("Introduce una palabra o no pongas nada para salir: ");
            palabra = sc.nextLine();
            cadena.add(palabra);    
        } while (palabra.isEmpty()==false);
        
        for(String palabraActual: cadena){
            System.out.print(palabraActual);
        }
    }
}