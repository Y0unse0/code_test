import java.util.Scanner;
import java.math.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        int w, l, num;
        num = 1;
        while(true){


                 r = input.nextDouble();
                if(r == 0){
                    return;
                }
                 w = input.nextInt();
                 l = input.nextInt();

                double t = Math.sqrt((w*w)+(l*l));

                if(t>2*r) {
                    System.out.println("Pizza " + num + " does not fit on the table.");
                }else{
                    System.out.println("Pizza " + num + " fits on the table.");
                }
                num++;

        }
    }
}
