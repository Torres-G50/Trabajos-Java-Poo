package Vehiculo;

public class Taxi extends Vehiculo_principal {
    private String numeroLicencia;
    private double cobro;

    public Taxi(String matricula, String modelo, int potencia, String numeroLicencia) {
        super(matricula, modelo, potencia);
        this.numeroLicencia = numeroLicencia;
    }

    public void cobro(double distanciaRecorrida) {
        cobro = 25 + (distanciaRecorrida / 1000) * 20;
    }

    public String informacion() {
        return "Taxi - Matricula: " + getMatricula() + ", Modelo: " + getModelo() + ", Potencia: " + getPotencia() + ", Número de Licencia: " + numeroLicencia;
    }

    public double getCobro() {
        return cobro;
    }
    public static void main(String[] args) {
        
       Taxi taxi1 = new Taxi("ABC123", "Toyota Prius", 100, "TAXI001");
        taxi1.cobro(1.5);
        System.out.println("Cobro del taxi rojo: " + taxi1.informacion());
        System.out.println("");

        Taxi taxi2 = new Taxi("DEF456", "Chevrolet Spark", 80, "TAXI002");
        taxi2.cobro(2.7);
        System.out.println("Cobro del taxi azul: " + taxi2.informacion());
        System.out.println("");

        Taxi taxi3 = new Taxi("GHI789", "Nissan Versa", 120, "TAXI003");
        taxi3.cobro(0.8);
        System.out.println("Cobro del taxi amarillo: " + taxi3.informacion()); 
    }
}


   
   
