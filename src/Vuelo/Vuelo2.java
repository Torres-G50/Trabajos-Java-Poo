package Vuelo;


public class Vuelo2 {
int No_vuelo, canpasajeros;
String origen, destino, aerolinea;

public void despegar(){
    System.out.println("El vuelo "+origen +" con destino a "+destino);
    System.out.println("Despega a las 7am\n");
}
public void setNo_vuelo(int No_vuelo){
    this.No_vuelo=No_vuelo;}
public int getNo_vuelo(){
    return(No_vuelo);
}
public void setCanpasajeros(int canpasajeros ){
    this.canpasajeros=canpasajeros;}
public int getCanpasajeros(){
    return(canpasajeros);
}
public void setOrigen(String origen ){
    this.origen=origen;}
public String getOrigen(){
    return(origen);
}
public void setDestino(String destino ){
    this.destino=destino;}
public String getDestino(){
    return(destino);
}
public void setAerolinea(String aerolinea ){
    this.aerolinea=aerolinea;}
public String getAerolinea(){
    return(aerolinea);
}
public void imprimir(){
    System.out.println("N# de vuelo: "+getNo_vuelo());
    System.out.println("N# de pasajeros: "+getCanpasajeros());
    System.out.println("Aerolínea: "+getAerolinea());
    System.out.println("Origen: "+getOrigen()+" Destino: "+getDestino());
}
    public static void main(String[] args) {
    Vuelo2 Vuelo1=new Vuelo2();
    Vuelo1.setNo_vuelo(5678);
    Vuelo1.setCanpasajeros(20);
    Vuelo1.setAerolinea("Volaris");
    Vuelo1.setOrigen("Durango");
    Vuelo1.setDestino("Tijuana");
    Vuelo2 Vuelo2=new Vuelo2();
    Vuelo2.setNo_vuelo(8899);
    Vuelo2.setCanpasajeros(50);
    Vuelo2.setAerolinea("AeroMéxico");
    Vuelo2.setOrigen("Cd. de México");
    Vuelo2.setDestino("Cancún");
    Vuelo1.imprimir();
    Vuelo1.despegar();
    Vuelo2.imprimir();
    Vuelo2.despegar();
    Vuelo1.toString();
    Vuelo2.toString();
    }
    @Override
    public String toString() {
        return "Vuelo{" + "No_vuelo=" + No_vuelo + ", canpasajeros=" + canpasajeros +
                ", origen=" + origen + ", destino=" + destino +
                ", aerolinea=" + aerolinea + '}';
    }
}
