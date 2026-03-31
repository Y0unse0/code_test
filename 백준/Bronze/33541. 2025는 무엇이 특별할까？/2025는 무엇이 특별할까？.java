import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt()+1;

        while(x<=9999){
            if(Math.pow(x/100 + x%100,2) == Math.pow(x,1)){
                System.out.println(x);
                return;
            }
            x++;
        }
        if(x==10000){
            System.out.println(-1);
        }
    }
}
