
import java.util.Arrays;

public class SortJaggedArray {
    public static void main(String[] args) {
        int a[][] = {
            {5, 2, 4},
            {9, 3},
            {8, 1, 6, 2}
        };

        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);

            for (int n : a[i])
                System.out.print(n + " ");
            System.out.println();
        }
    }
}

