package Calculadora;

import java.util.Scanner;

public class Calculadora_Basica {

    public static void main(String[] args) {
        Scanner numeros=new Scanner(System.in);
        Scanner opcionfinal=new Scanner(System.in);
        int numero1,numero2,opcion,numerofinal; 
        System.out.println("Introdusca 2 numeros");
        numero1=numeros.nextInt();
        numero2=numeros.nextInt();
        
        System.out.println("////////////////////");
        
        System.out.println("Menu de opciones");
        System.out.println("¿Que decea hacer con los numeros?");
        System.out.println("1*- Suma");
        System.out.println("2*- resta");
        System.out.println("3*- multiplicacion");
        System.out.println("4*- Divicion");
        
        System.out.println("////////////////////");
        opcion=opcionfinal.nextInt();
        System.out.println("////////////////////");
        
        switch (opcion){
         
         case 1:
             numerofinal=numero1+numero2;
             System.out.println("La suma Es: "+numerofinal);
             break;
         case 2:
             numerofinal=numero1-numero2;
             System.out.println("La Reta Es: "+numerofinal);
             break;
             case 3:
                 numerofinal=numero1*numero2;
                 System.out.println("La multiplicacion Es: "+numerofinal);
                 break;
                 case 4:
                     numerofinal=numero1/numero2;
                     System.out.println("La divicion Es: "+numerofinal);
                     break;
                     default:
                         System.out.println("opcion no valida");
         
         }   
    }
}
