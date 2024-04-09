package Matriz;
import java.util.Random;
public class Matriz_Poo {
    public static void main(String[] args) {
        float Matriz1[][]=new float[5][5];
        float numeroaleatorio=0;
        System.out.println("Matriz 5*5");
        for (int x = 0; x< 5; x++) {
            for (int y = 0; y < 5; y++) {
                numeroaleatorio=(float)(Math.random()*10);
                Matriz1[x][y]=numeroaleatorio;
                System.out.print("|"+Matriz1[x][y]+"|");
            }
            System.out.println("");
        }
    }
    
}
