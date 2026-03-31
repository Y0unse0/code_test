import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        int max ;

        while(true) {
            max = 0;
            int index = 0;
            for (int j = 1; j < n; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    index = j;
                }
            }
            if (max < arr[0]) {
                System.out.println(num);
                return;
            } else {
                arr[0] += 1;
                arr[index] -= 1;
                num++;
            }
        }
    }
}
