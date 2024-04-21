import java.util.Scanner;
public class ejer9 {
    
    /*Realizar un programa que lea tres valores enteros. Estos valores representarán los lados de un triángulo,
ergo, lados {a, b, c}. Mostrar si efectivamente pueden los valores {a, b, c } pueden formar un triángulo. */
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el lado 1: ");
        x = sc.nextInt();
        System.out.println("Introduce el lado 2: ");
        y = sc.nextInt();
        System.out.println("Introduce el lado 3: ");
        z = sc.nextInt();

        if ((x+y)>z && (x+z)>y  && (y+z)>z) {
            System.out.println("Los lados {a, b, c} pueden formar un triángulo");
        }else{
            System.out.println("Los lados {a, b, c} no pueden formar un triángulo");
        }
    }
}
