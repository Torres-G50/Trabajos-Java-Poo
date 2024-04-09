package Vehiculo;

public class Autobus extends Vehiculo_principal {
    private int numeroPlaza;
    private double cobro;
    private String tipoPasajero;

    public Autobus(String matricula, String modelo, int potencia, int numeroPlaza) {
        super(matricula, modelo, potencia);
        this.numeroPlaza = numeroPlaza;
    }

    public void cobro(String tipoPasajero) {
        if (tipoPasajero.equals("estudiante")) {
            cobro = 6.5;
            this.tipoPasajero = "Estudiante";
        } else {
            cobro = 12.0;
            this.tipoPasajero = "Estandar";
        }
    }

    public String informacion() {
        return "Matricula: " + getMatricula() + ", Modelo: " + getModelo() + ", Potencia: " + getPotencia() + ", Numero de Plaza: " + numeroPlaza + ", Tipo de Pasajero: " + tipoPasajero + ", Cobro: " + cobro;
    }
    public static void main(String[] args) {
        
     Autobus sanmarcos = new Autobus("JKL012", "Mercedes Benz", 300, 50);
        sanmarcos.cobro("estudiante");
        System.out.println("Cobro del autobus 1: " + sanmarcos.informacion());

        Autobus sanmateo = new Autobus("MNO345", "Volvo", 400, 55);
        sanmateo.cobro("estandar");
        System.out.println("Cobro del autobus 2: " + sanmateo.informacion());

        Autobus sanjose = new Autobus("PQR678", "Scania", 350, 60);
        sanjose.cobro("estandar");
        System.out.println("Cobro del autobus 3: " + sanjose.informacion());   
    }
}