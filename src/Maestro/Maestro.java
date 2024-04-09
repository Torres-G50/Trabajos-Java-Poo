package Maestro;

import java.util.Scanner;

public class Maestro {
    private String clave,nombre;
    private int anios_servicio;
    private float sueldo,bono,total;
    
    public Maestro(String clave, String nombre, int anios_servicio, float sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.anios_servicio = anios_servicio;
        this.sueldo = sueldo;
    }
     public float tabla() {
        int años = anios_servicio;
        
        switch (años) {
            case 0:
                bono = 0;
                break;
            case 5:
                bono = 10000;
                break;
            case 10:
                bono = 15000;
                break;
            case 15:
                bono = 20000;
                break;
            case 20:
                bono = 25000;
                break;
            case 25:
                bono = 30000;
                break;
            case 30:
                bono = 35000;
                break;
            case 35:
                bono = 40000;
                break;
            case 40:
                bono = 45000;
                break;
            default:
                bono = 0;
                break;
        }
        
        return bono;
    }
    @Override
    public String toString() {
        total=sueldo+bono; 
        System.out.println("***************************");
        return "Maestro " + "clave=" + clave + ", nombre=" + nombre + ", años_servicio=" + anios_servicio + ", sueldo=" + sueldo + ", bono=" + bono + ", total=" + total;
    }
    
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la clave del maestro: ");
        String clave = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del maestro: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese los años de servicio del maestro: ");
        int anios_servicio = scanner.nextInt();
        
        System.out.print("Ingrese el sueldo del maestro: ");
        float sueldo = scanner.nextFloat();
        
     
        Maestro maestro = new Maestro(clave, nombre, anios_servicio, sueldo);
        float bono = maestro.tabla();
        System.out.println(maestro.toString());
    }
}


