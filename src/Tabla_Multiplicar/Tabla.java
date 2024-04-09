package Tabla_Multiplicar;

public class Tabla {

   public static void Multiplicartab(){
   int t=7,r=0;
       for (int i = 1; i <= 10; i++) {
           r=t*i;
           System.out.println(t+"*"+i+" = "+r);
       }
       }
    public static void main(String[] args) {
       Multiplicartab();
    }
    
}
