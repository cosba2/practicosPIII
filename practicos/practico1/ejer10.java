import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ejer10 {
    /*Modificar el programa de arriba para que, en caso que los lados { a, b, c } puedan formar un
    triángulo, indicar de qué tipo es: escaleno, isósceles o equilátero. */ 

    public static boolean esEscaleno(int a,int b,int c){
        return a != b && b!= c && a!= c;
    }

    public static boolean esIsosceles(int a, int b, int c) {
        return (a == b && a != c) || (a == c && a != b) || (b == c && b != a);
    }
    
    public static void main(String[] args) {

        int x, y, z;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado 1:");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("El lado 1 no es un número entero.");
            return;
        }

        System.out.println("Introduce el lado 2:");
        if (sc.hasNextInt()) {
            y = sc.nextInt();
        } else {
            System.out.println("El lado 2 no es un número entero.");
            return;
        }

        System.out.println("Introduce el lado 3:");
        if (sc.hasNextInt()) {
            z = sc.nextInt();
        } else {
            System.out.println("El lado 3 no es un número entero.");
            return;
        }

        if ((x+y)>z && (x+z)>y  && (y+z)>x) {
            if (esEscaleno(x,y,z)) {
                System.out.println("El triangulo es escaleno");
            } else if (esIsosceles(x, y, z)) {
               System.out.println("El triangulo es isosceles");
            } else {
                System.out.println("El triangulo es equilatero");
            }
        } else {
            System.out.println("Los lados {" + x + ", " + y + ", " + z + "} no pueden formar un triangulo");
        }
    }
}