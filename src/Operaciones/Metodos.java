package Operaciones;


public class Metodos {
    
    public void multiplicacion(){
    int valor1,valor2;
    valor1=4;
    valor2=6;
        System.out.println("La multiplicacion es "+valor1*valor2);
    }
    public int multi(int r){
    double h;
    h=Math.pow(r, 2);//elevar a la potencia x
    return (int)h;//forzamos a convertir el doble a entero
    }
    public static void main(String[] args) {
        Metodos resultado=new Metodos();
        resultado.multiplicacion();
        resultado.multi(5);
        System.out.println("5 al cuadrado es: "+resultado.multi(5));
    }
}
