
import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        int max = a[0];
        for (int n : a)
            if (n > max)
                max = n;

        System.out.println("Maximum = " + max);
    }
}

