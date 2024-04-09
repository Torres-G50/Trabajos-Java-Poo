package Factorial;

import java.util.Scanner;

public class Factorial {
    
public int valor_acalcular;

public int Factorial(int numerofac){
    
    if (numerofac>0) {
        valor_acalcular=numerofac*Factorial(numerofac - 1);
        return valor_acalcular;
    }
    return 1;
}
    public static void main(String[] args) {
        
        Scanner numeroGuadado=new Scanner(System.in);
        Factorial operacion=new Factorial();
        
        int numerousuario,numerofinal;
        
        System.out.print("Dame el numero a sacar factorial: ");
        numerousuario = numeroGuadado.nextInt();
         System.out.println("*******************************");
         
         numerofinal=operacion.Factorial(numerousuario);
         
         if (numerousuario<=0) {
             System.out.println("No se puede sacar factoria del numero "+numerousuario);
        }else{
          System.out.println("El factorial de: "+numerousuario+" es "+numerofinal);
         }
    }
}
