public class Celular {
    private String Modelo;
    private String Marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;


    public Celular(String Modelo, String Marca) {
        this.Modelo = Modelo;
        this.Marca = Marca;
    }
    
    public Celular(String Modelo, String Marca, int memoria, boolean radio, int nroCelular) {
        this.memoria = memoria;
        this.radio = radio;
        this.nroCelular = nroCelular;
    }

    public void realizarLlamada() {
        System.out.println("Llamando...");
    }

    public void cortarLlamada() {
        System.out.println("Llamada terminada...");
    }

    public String getModelo() {
        return Modelo;
    }



    public void setModelo(String modelo) {
        Modelo = modelo;
    }



    public String getMarca() {
        return Marca;
    }



    public void setMarca(String marca) {
        Marca = marca;
    }



    public int getMemoria() {
        return memoria;
    }



    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }



    public boolean isRadio() {
        return radio;
    }



    public void setRadio(boolean radio) {
        this.radio = radio;
    }



    public int getNroCelular() {
        return nroCelular;
    }



    public void setNroCelular(int nroCelular) {
        this.nroCelular = nroCelular;
    }


    public static void main(String[] args) {

        Celular celular = new Celular("A53", "Apple");
        Celular celular2 = new Celular("11", "Apple", 16, true, 123456789);

        System.out.println("Modelo: " + celular.getModelo()); 
        System.out.println("Marca: " + celular.getMarca());
        
        celular.realizarLlamada();
        celular.cortarLlamada();
    }

}
