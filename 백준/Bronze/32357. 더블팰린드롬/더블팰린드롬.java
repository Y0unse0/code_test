import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int num = 0;
        for(int i=0;i<t;i++){
            boolean flag=true;
            String s = input.next();
            int index = s.length();

            for(int j=0;j<index/2;j++){
                if(s.charAt(j) != s.charAt(index-j-1)){
                    flag = false;
                }
            }
            if(flag){num++;}

        }
        System.out.println(num*(num-1));
    }
}
