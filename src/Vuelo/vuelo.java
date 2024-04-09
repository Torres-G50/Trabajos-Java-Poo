package Vuelo;

public class vuelo {
    int numerovuelo;
    int pasajeros;
    String origen, Destino, aerolinea;
    
    public void  despegar(){
    
        System.out.println("El vuelo de origen: "+origen+" con destino a: "+Destino);
        System.out.println("Despega a las 7am");
    }        
    public void setorigen(String origen){
    this.origen=origen;
    }
    public void setDestino(String Destino){
    this.Destino=Destino;
    }
    public void setaaerolinea(String aerolinea){
    this.aerolinea=aerolinea;
    }
    
    public String getorigen(){
    return origen;
    }
    public String getoDestino(){
    return Destino;
    }
    public String getaerolinea(){
    return aerolinea;
    }
    
    public  void imprimir(){
        System.out.println("");
    }
    public static void main(String[] args) {
        System.out.println("Vuelo 1");  
      vuelo vuelo1=new vuelo();
      vuelo1.numerovuelo=456;
      vuelo1.pasajeros=45;
      vuelo1.origen="Durango";
      vuelo1.Destino="Mazatlan";
      vuelo1.aerolinea="aeromexico";
      vuelo vuelo2=new vuelo();
      vuelo1.despegar();
        System.out.println("");
        
         System.out.println("Numero de vuelo: "+vuelo1.numerovuelo);
        System.out.println("Numero de pasajeros aceptados: "+vuelo1.pasajeros);
        System.out.println("Origenes del vuelo: "+vuelo1.origen);
        System.out.println("Destino del vuelo: "+vuelo1.Destino);
        System.out.println("Aerolinea del vuelo: "+vuelo1.aerolinea);
        System.out.println("");
        
        System.out.println("Vuelo2");
      vuelo2.numerovuelo=555;
      vuelo2.pasajeros=88;
      vuelo2.origen="mazatlan";
      vuelo2.Destino="Durango";
      vuelo2.aerolinea="vamos mexico";
      vuelo2.despegar();
        System.out.println("");
      
         System.out.println("Numero de vuelo: "+vuelo2.numerovuelo);
        System.out.println("Numero de pasajeros aceptados: "+vuelo2.pasajeros);
        System.out.println("Origenes del vuelo: "+vuelo2.origen);
        System.out.println("Destino del vuelo: "+vuelo2.Destino);
        System.out.println("Aerolinea del vuelo: "+vuelo2.aerolinea);
        
    }
}
