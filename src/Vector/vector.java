package Vector;

import java.util.Scanner;

public class vector {
    
public void vector1(){
    
int vec[]=new int[5];
Scanner ob=new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
        System.out.println("Dame el valor del vector en la posicion("+i+"): ");
        vec[i]=ob.nextInt();
    }
    System.out.println("");
    System.out.println("Vector Proporcionado");
    for (int x = 0; x < 5; x++) {
        System.out.print("|"+vec[x]+"|");
    }
    System.out.println("\n");
}
   public void vector2(){
   
   float vec2[]={0.6f,8.5f,7.1f,4.9f};
   System.out.println("Vector Por codigo");
       for (int h = 0; h < vec2.length; h++) {
           System.out.print("|"+vec2[h]+"|");
       }
       System.out.println("");
   }
    public static void main(String[] args) {
      vector v=new vector();
      v.vector1();
      v.vector2();
    }
    
}
