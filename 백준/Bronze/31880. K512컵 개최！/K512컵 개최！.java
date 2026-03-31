import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        long p = 0;
        for(int i = 0; i < N; i++){
            int a = input.nextInt();
            p+=a;
        }

        for(int i = 0; i < M; i++){
            int b = input.nextInt();
            if(b>0){
                p*=b;
            }
        }
        System.out.println(p);
    }
}
