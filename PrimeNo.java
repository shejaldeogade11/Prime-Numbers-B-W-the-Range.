package Array.JAVA_PROGRAMMING_BATCH;

import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Starting Range...");

        int st = s.nextInt();

        System.out.println("Enter the Ending Range...");

        int end = s.nextInt();

        for (int i = st; i <= end; i++) {

            int n = i;

            int count = 0;

            for (int j = 1; j <= n; j++) {

                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n);
            }
        }

    }
}
