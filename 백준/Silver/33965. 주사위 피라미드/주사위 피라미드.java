import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 20 + (18*(2*(n-1))) +(15*(((n-2)*(n-1))/2))+ (11*(n-1))+(6*(n-1)*(n-2));
        int min = 15 + (10*(2*(n-1))) +(6*(((n-2)*(n-1))/2))+ (3*(n-1))+(1*(n-1)*(n-2));
        System.out.println(max+min);
    }
}
