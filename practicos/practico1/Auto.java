public class Auto {
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;

    public Auto(String color, String patente, int año, String modelo, int km) {
        this.color = color;
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }
    /*Para la clase del ejercicio 2 crear el método encender donde muestre por pantalla el mensaje "El auto se
incendió". Además crear otro método llamado kilometrajeMayor, este método debe tener que mostrar los
autos con más de 100000 km. */


    public void encender() {
        System.out.println("El auto " + this.patente+ " se encendió");
    }

    public void kilometrajeMayor(){
        if (this.km >= 100000) {
            System.out.println("El auto con más de 100000 km es: " + this.patente);
        } else {
            System.out.println("El auto " + this.patente + " tiene menos de 100000 km");;
            
        }
    }

    public static void main(String[] args) {
        Auto auto = new Auto("Rojo", "ABC123", 2019, "Modelo 2019", 100000);
        Auto auto2 = new Auto("Azul", "DEF456", 2020, "Modelo 2020", 1500);

        auto.encender();

        auto.kilometrajeMayor();
        auto2.kilometrajeMayor();
    }
}
