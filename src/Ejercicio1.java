import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numLimite = 0; int i = 1; int sum;int sum2 = 0; String res = "0";
        System.out.println("Ingrese el numero limite el cual quiere que llegue la sumatoria: ");
        try {
            numLimite = x.nextInt();
            if (numLimite < 0 ){throw new Exception();}
            for (;i<= numLimite; i++){
                res += " + " + i;
                sum2 += i;
            }
            sum = numLimite*(numLimite+1)/2;
            System.out.println(res + " = " + sum);
            System.out.println("Sumatoria en for = " + sum2);
        } catch (Exception e){
            System.out.println("Ups! Hubo un error en la lectura del dato ingresado.");
            System.out.println();
            main(args);
        }

    }
}
