import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a; int r; int n; int i = 2; String res = "";
        long sum;long sum2;

        System.out.print("Ingresa el valor de a = ");
        try {
            a = x.nextInt();
            if(a<1){throw new Exception("Ups! a tiene que ser mayor a 0");}
            System.out.print("Ingresa el valor de r = ");
            r = x.nextInt();
            if(r<=1){throw new Exception("Ups! r tiene que ser mayor a 1");}
            System.out.print("Ingresa el valor de n = ");
            n = x.nextInt();
            if(n<0){throw new Exception("Ups! n tiene que ser mayor o igual a 0");}
//            String res = a + " + " + a+""+r + " + " + a+""+r+"^"+r;

            if(n==0){
                res += a;
                System.out.println("Sumatoria = " + a);
            } else if(n==1){
                res += a + " + ("+a+")("+r+")";
                System.out.println("Sumatoria = " + ( a+(a*r)));
            } else {
                res += a + " + ("+a+")("+r+")";
                sum = a + (a*r);
                for (;i<=n;i++){
                    res += " + ("+a+")("+r+")^"+i;
                    sum += a * (Math.pow(r,i));
                }
                sum2 = (long)(a*Math.pow(r,(n+1))-a)/(r-1);
                System.out.println(res);
                System.out.println("La sumatoria = " + sum);
                System.out.println("Sumatoria usando formula = " + sum2);
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
