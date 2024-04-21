import java.util.Scanner;
public class ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        
        do {
            System.out.println("Introduce un numero (A):");
            if (sc.hasNextInt()) {
                x = sc.nextInt();
            } else {
                System.out.println("No es un número entero.");
                return;
            }
            
            System.out.println("Introduce un numero (B):");
            if (sc.hasNextInt()) {
                y = sc.nextInt();
            } else {
                System.out.println("No es un número entero.");
                return;
            }
            if (x<y) {
                for (int i=x; i<y; i++) {
                    if (i%2==0) {
                        System.out.println("El numero " + i + " es par");
                    }
                }    
            }
                
        } while (x>y);
        
    }
}
