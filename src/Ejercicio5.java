import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n; int i = 1;int par = 4; String res = "2";
        int sum = 2;
        int sum2;
        try{
            System.out.print("Ingrese el numero de pares el cual quiere calcular la sumatoria: ");
            n = x.nextInt();
            if(n<1){throw new Exception("n tiene que ser mayor a 0");}
            if(n==1){
                System.out.println(res);
                System.out.println("La sumatoria = " + sum);
            } else {
                for (;i<n;i++,par+=2){
                    res += " + " +par;
                    sum += par;
                }
                sum2 = n * (n+1);
                System.out.println(res);
                System.out.println("La sumatoria = " + sum);
                System.out.println("La formula para calcular la sumatoria es n x ( n + 1 )");
                System.out.println("La sumatoria utilizando formula = " + sum2);

            }

        } catch (Exception e){
            if(e.getMessage() != null){
                System.out.println(e.getMessage());
            } else {
                System.out.println("Ups! Hubo un error en la lectura de un dato");
            }
            System.out.println();
            main(args);
        }
    }
}
