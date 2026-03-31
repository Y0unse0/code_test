import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a >= 300) {
                System.out.println(1);
            } else if (a >= 275) {
                System.out.println(2);
            } else if (a >= 250) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }

        }

    }
}
