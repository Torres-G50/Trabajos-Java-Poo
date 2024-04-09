package Vehiculo;

public class Vehiculo_principal {
    private String matricula;
    private String modelo;
    private int potencia;

    public Vehiculo_principal(String matricula, String modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia() {
        return potencia;
    }
}

