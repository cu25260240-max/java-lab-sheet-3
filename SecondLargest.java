
public class SecondLargest {
    public static void main(String[] args) {
        int a[] = {10, 50, 20, 40, 30};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : a) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n < max) {
                second = n;
            }
        }

        if (second == Integer.MIN_VALUE)
            System.out.println("No second largest element");
        else
            System.out.println("Second largest = " + second);
    }
}

