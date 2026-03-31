import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        boolean flag = true;
        for(int i=0;i<t;i++){
            flag = true;
            int b = input.nextInt()+1;
            int c = (int)Math.sqrt(b)+1;
            for(int j=2;j<=c;j++){
                if(b != j) {
                    if (b % j == 0) {
                        flag = false;
                    }
                }
            }
            if(!flag){
                System.out.println(0);
            }else{
                System.out.println(1);
                System.out.println(1+" "+b);
            }
        }
    }
}
