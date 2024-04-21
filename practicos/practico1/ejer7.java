import java.util.Scanner;

public class ejer7 {
//     Realizar un programa Java que lea un número entero por teclado y calcule si es par o impar. Podemos saber
// si un número es par cuando el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es
// impar. El operador Java que calcula el resto de la división entre dos números enteros o no es el operador % 2

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        
        x = sc.nextInt();
        
        if (x%2==0) {
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
            
        }
        
    }
}
