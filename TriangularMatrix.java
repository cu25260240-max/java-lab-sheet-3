
public class TriangularMatrix {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Upper triangle:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(j >= i ? a[i][j] + " " : "0 ");
            System.out.println();
        }

        System.out.println("Lower triangle:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(i >= j ? a[i][j] + " " : "0 ");
            System.out.println();
        }
    }
}

