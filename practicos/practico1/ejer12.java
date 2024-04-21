import java.util.Scanner;
public class ejer12 {
    public static void main(String[] args) {
        int x;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo: ");
        
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("No es un numero positivo.");
            return;
        }


        // for (int i=x-1 ; i>0 ; i--){
        //     x=x*i;
        // }
        // System.out.println("El factorial de " + x + " es: " + x);
        
        int i=x-1;
        do {
            x*=i;
            i--;
        } while (i>=1);
        System.out.println("El factorial de " + x + " es: " + x);
    }

}
