import java.util.*;

public class ejer15{


    public static void incisoA(){
        Scanner sc = new Scanner(System.in);
        int x=1;
        
        while (x!=0) {
            
            System.out.print("Introduce un numero (0 para salir): ");
            x=sc.nextInt();    
            
            if (x%2==0 && x>0) {
                System.out.println("El numero " + x + " es par y positivo");
            } else if (x%2==0 && x<0) {
                System.out.println("El numero " + x + " es par y negativo");
            } else if (x%2!=0 && x>0) {
                System.out.println("El numero " + x + " es impar y positivo");
            } else if (x%2!=0 && x<0) {
                System.out.println("El numero " + x + " es impar y negativo");
            }
        }
        System.out.println("finalizo el programa.");
    }
    
    public static void incisoB(){
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("Introduce un numero (0 para salir): ");
            x=sc.nextInt();    
            
            if (x%2==0 && x>0) {
                System.out.println("El numero " + x + " es par y positivo");
            } else if (x%2==0 && x<0) {
                System.out.println("El numero " + x + " es par y negativo");
            } else if (x%2!=0 && x>0) {
                System.out.println("El numero " + x + " es impar y positivo");
            } else if (x%2!=0 && x<0) {
                System.out.println("El numero " + x + " es impar y negativo");
            }
        } while (x!=0);
    }

    public static void incisoC(){
        Scanner sc = new Scanner(System.in);
        int x;
        char y;
        do {
            System.out.print("Introduce un numero: ");
            x=sc.nextInt();    
            
            if (x%2==0 && x>0) {
                System.out.println("El numero " + x + " es par y positivo");
            } else if (x%2==0 && x<0) {
                System.out.println("El numero " + x + " es par y negativo");
            } else if (x%2!=0 && x>0) {
                System.out.println("El numero " + x + " es impar y positivo");
            } else if (x%2!=0 && x<0) {
                System.out.println("El numero " + x + " es impar y negativo");
            }
            //lo hago asi solo porque lo pide el ejercicio, pero yo lo haria pasando todo 
            //a mayusculas o minisculas y asi el usuario no tenga que preocuparse por eso.
            System.out.println("Desea introducir otro numero?(S o s / N o n ): ");
            y=sc.next().charAt(0);
        } while (y!='N' && y!='n');
    }

    public static void main(String[] args) {
        int opcion;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. INCISO A");
            System.out.println("2. INCISO B");
            System.out.println("3. INCISO C");
        
            System.out.print("Introduce un numero para ingresar 0 para salir: ");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                    incisoA();
                    break;
                case 2:
                    incisoB();
                    break;
                case 3:
                    incisoC();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
            
    }
}