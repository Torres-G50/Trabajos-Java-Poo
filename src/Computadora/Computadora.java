package Computadora;

public class Computadora {
    
    private String marca, modelo;
    private float precio;
    private int memoria;
    
    public void setMarca(String marca ){
        this.marca=marca;
    }
    
    public String getMarca(){
        return(marca);
    }
    
    public void setModelo(String modelo ){
        this.modelo=modelo;
    }
    
    public String getModelo(){
        return(modelo);
    }

    public void setPrecio(float precio  ){
        this.precio=precio;
    }
    
    public float getPrecio(){
        return(precio);
    }
    
    public void setMemoria(int memoria  ){
        this.memoria=memoria;
    }
    
    public int getMemoria(){
        return(memoria);
    }

    @Override
    public String toString() {
        return "Computadora:" + "\nmarca=" + marca 
                + "\nmodelo=" + modelo 
                + "\nprecio=" + precio 
                + "\nmemoria=" + memoria;
    }
    
    public static void main(String[] args) {
        Computadora pc1=new Computadora();
      
        Computadora pc2=new Computadora();
       
        pc1.setMarca("HP");
        pc1.setModelo("Pavilion");
        pc1.setPrecio(19000);
        pc1.setMemoria(512);
        
        pc2.setMarca("Lenovo");
        pc2.setModelo("320");
        pc2.setPrecio(4900);
        pc2.setMemoria(128);
        
        System.out.println(pc1.toString()); 
        
        System.out.println("/////////////////////////");
        
       System.out.println(pc2.toString()); 
    }
    
}
