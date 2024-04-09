
package Laptop;
//Guadalupe Torres :)

public class Laptop2 {
private String fabricante,sistema_operativo,procesador,tipo_sistema;
private boolean entrada_tactil;
private int precio;
                                
 public Laptop2(String fabricante, String sistema_operativo, String procesador, boolean entrada_tactil, String tipo_sistema, int precio) {
     this.fabricante = fabricante;
     this.sistema_operativo = sistema_operativo;
     this.procesador = procesador;
     this.entrada_tactil = entrada_tactil;
     this.tipo_sistema = tipo_sistema;
     this.precio = precio;
 }
                                    
 public String getFabricante() {
return fabricante;
 }
                                        
public String getSistemaOperativo() {
    return sistema_operativo;
 }
                                            
public String getProcesador() {
 return procesador;
 }
 public boolean isEntradaTactil() {
 return entrada_tactil;
}
                                                    
 public String getTipoSistema() {
 return tipo_sistema;
  }
                                                        
 public int getPrecio() {
return precio;
}
                                                            
public int venta(String tipo_sistema, boolean entrada_tactil) {
int precio_final;
 if (tipo_sistema.equals("64") && entrada_tactil) {
 precio_final = 15000;
 } else if (tipo_sistema.equals("64") && !entrada_tactil) {
 precio_final = precio - 3000;
} else if (fabricante.equals("Mac")) {
   precio_final = entrada_tactil ? 25000 : 20000;
   } else {
 precio_final = 10000;
 }
  datos();
  return precio_final;
   }
                                                                
   public void datos() {
  System.out.println("Venta de la laptop:");
  System.out.println("*********************");
  System.out.println("Fabricante: " + fabricante);
  System.out.println("Sistema operativo: " + sistema_operativo);
  System.out.println("Procesador: " + procesador);
  System.out.println("Entrada táctil: " + entrada_tactil);
  System.out.println("Tipo de sistema: " + tipo_sistema);
  System.out.println("Precio: " + precio);
  
 }
    public static void main(String[] args) {
        Laptop2 laptop1 = new Laptop2("HP", "Windows 10", "Intel Core i5", true, "64", 20000);
        Laptop2 laptop2 = new Laptop2("Lenovo", "Ubuntu", "AMD Ryzen 5", false, "32", 12000);
        Laptop2 laptop3 = new Laptop2("Mac", "MacOS", "Apple M1", true, "64", 30000);
        Laptop2 laptop4 = new Laptop2("Dell", "Windows 11", "Intel Core i7", false, "64", 18000);

        int precio_final = laptop1.venta("64", true); 
        System.out.println("El precio final de la laptop es: " + precio_final);
        System.out.println("*********************");
        System.out.println("");
        precio_final = laptop2.venta("32", false); 
        System.out.println("El precio final de la laptop es: " + precio_final);
        System.out.println("*********************");
        System.out.println("");
        precio_final = laptop3.venta("64", true); 
        System.out.println("El precio final de la laptop es: " + precio_final);
        System.out.println("*********************");
        System.out.println("");
        precio_final = laptop4.venta("64", false);
        System.out.println("El precio final de la laptop es: " + precio_final);
        System.out.println("*********************");
        System.out.println("");
    }
}