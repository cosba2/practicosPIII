import java.util.Scanner;

public class ejer17 {

    public static void esFinDeSemana(int dia) {
        if (dia == 1 || dia ==7) {
            System.out.println("Es fin de semana");
        } else{
            System.out.println("No es fin de semana");
        }        
    }

    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 7: ");
        day = sc.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("El numero introducido no es valido");
        } else{
            switch(day){
                case 1:
                    System.out.print("Domingo ");
                    esFinDeSemana(day);
                    break;
                case 2:
                    System.out.print("Lunes ");
                    esFinDeSemana(day);
                    break;
                case 3:
                    System.out.print("Martes ");
                    esFinDeSemana(day);
                    break;
                case 4:
                    System.out.print("Miercoles ");
                    esFinDeSemana(day);
                    break;
                case 5:
                    System.out.print("Jueves ");
                    esFinDeSemana(day);
                    break;
                case 6:
                    System.out.print("Viernes ");
                    esFinDeSemana(day);
                    break;
                case 7:
                    System.out.print("Sabado ");
                    esFinDeSemana(day);
                    break;
            }
        }
    }
}