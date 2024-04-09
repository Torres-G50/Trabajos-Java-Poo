package Instrumento;

public class Instrumento {
    String nombre;
    String tipo;
    int precio;
    
public void setNombre(String nombre){
    this.nombre=nombre;
}

public String getNombre(){
    return(nombre);
}

public void setTipo(String tipo){
this.tipo=tipo;
}

public String getTipo(){
return tipo;
}

public void setPrecio(int precio){
this.precio=precio;
}

public int getPrecio(){
return(precio);
}

public void imprimir(){
    System.out.println("Nombre: "+ getNombre());
    System.out.println("Precio: "+ getPrecio());
    System.out.println("tipo: "+ getTipo());
    System.out.println("");
}

    public static void main(String[] args) {
        Instrumento piano=new Instrumento();
        Instrumento saxofon= new Instrumento();
        piano.setNombre("Piano");
        piano.setPrecio(30000);
        piano.setTipo("De cola");
        saxofon.setNombre("Saxofón");
        saxofon.setPrecio(15000);
        saxofon.setTipo("Acústico");
        piano.imprimir();
        saxofon.imprimir();
    }
}
