
import java.util.Scanner;

public class SearchThreeD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][][] = new int[2][2][2];
        boolean found = false;

        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();

        System.out.println("Enter number to search:");
        int n = sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (a[i][j][k] == n) {
                        System.out.println("Found at: " +
                            i + ", " + j + ", " + k);
                        found = true;
                    }

        if (!found)
            System.out.println("Not found");
    }
}

