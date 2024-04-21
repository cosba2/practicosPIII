import java.util.Scanner;
public class ejer8 {
    public static void main(String[] args) {
        char caracter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        String cadena = sc.nextLine();
        

        if (cadena.length()>1) {
            System.out.println("Por favor ingrese un solo caracter.");
        }else {
            caracter = cadena.charAt(0);
            if(!Character.isLetter(caracter)) {
                System.out.println("El caracter no es una letra");
            }else{
                if (Character.isUpperCase(caracter)) {
                    System.out.println("El caracter es mayuscula");
                }else {
                    System.out.println("El caracter es minuscula");
                    
                }
            }
        
        }

    }
}
