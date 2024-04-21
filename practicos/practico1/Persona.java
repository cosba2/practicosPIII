import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Persona {
    
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    
    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Edad: " + this.edad);
        System.out.println("Ciudad: " + this.ciudad);
    }
    
    public void mayor18(){
        if (this.edad >= 18) {
            System.out.println(this.nombre + " Es mayor de edad");
        } else {
            System.out.println(this.nombre + " Es menor de edad");
            
        }
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Lautaro", "Martinez",'M', 19, "Bahia Blanca");
        Persona persona2 = new Persona("Juan", "Perez", 'M', 17, null);
        System.out.println("Los datos son: ");
        persona2.mostrarDatos();

        System.out.println("El mayor de 18 es:  ");
        persona2.mayor18();
        persona.mayor18();
    }
}
