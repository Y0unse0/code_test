

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,h,w;
        for(int i = 0; i < t; i++){
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();
            int result;
            if(n%h==0){
                result = h * 100 + (n/h);
            }else {
                result = ((n % h) * 100) + (n / h) + 1;
            }
            System.out.println(result);
        }


    }
}
