import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int numLimite; int i = 3; String res = ""; int sum; int sum2 = 7;
        System.out.print("Ingrese el numero limite de la sumatoria: ");
        System.out.println();
        try {
            numLimite = x.nextInt();
            if (numLimite < 0){throw new Exception();}
            if(numLimite == 0){res += "1"; sum2 = 1;}
            if(numLimite == 1){res += "1 + 2"; sum2 = 3;}
            if (numLimite >= 2){
                res = "1 + 3";
                for (;i <=numLimite; i++){
                    res += " + 2^" + i;
                    sum2 += Math.pow(2,i);
                }
            }
            sum = (int)Math.pow(2,(numLimite+1)) - 1;
            System.out.println(res + " = " + sum);
            System.out.println("Sumatoria con for = " + sum2);
        } catch (Exception e){
            System.out.println("Ups! Hubo un error en la lectura del dato.");
        }
    }
}
