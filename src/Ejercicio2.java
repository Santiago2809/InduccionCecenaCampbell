import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numLimite; int sum; int sum2 = 1; String res = "1";int j = 3;
        System.out.print("Ingrese el numero limite a cual quiere que llegue la sumatoria: ");
        try {
            numLimite = x.nextInt();
            if (numLimite < 1){throw new Exception();}
            for (int i = 0; i<= numLimite - 2;i++,j+=2){
                res += " + " + j;
                sum2 += j;
            }
            sum = (int)Math.pow(numLimite,2);
            System.out.println("\n" + res + " = " + sum );
            System.out.println("Sumatoria en for = " + sum2);
        } catch(Exception e){
            System.out.println("Ups! Hubo un error en la lectura del dato.");
            System.out.println();
            main(args);
        }

    }
}
