package rensyu.rensyu;

import java.io.IOException;
import java.util.Scanner;

public class Practice7 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int N = s;
        System.out.println(N);
        double z;
        double Z = 0;
        int i = 0;

        double[] x = {};
        double[] y = {};
        double[] X = { x[i] };
        double[] Y = { y[i] };

        for (i = 0; i < N; i++) {

            double a = x[i] - y[i];
            double b = Math.pow(a, 2);
            z = b++;
            Z = Math.sqrt(z);

        }

        System.out.println(Z);
    }
}
