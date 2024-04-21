import java.util.*;
public class ejer16 {
    public static void main(String[] args) {
        double cantMillas=1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce la cantidad de millas, 0 para salir: ");
            cantMillas = sc.nextDouble();
            if (cantMillas != 0) {
                cantMillas = cantMillas * 1.6093;                
                System.out.printf("La cantidad de millas en km es: %.2f. \n",cantMillas);
                System.out.println();
            }
        } while (cantMillas != 0);
        
    }
}
