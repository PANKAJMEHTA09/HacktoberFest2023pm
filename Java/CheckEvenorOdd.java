import java.util.*;
public class checkevenorodd {
    /**
     * @param args
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ToCheckEvenOdd(n);

    }

    public static void ToCheckEvenOdd(int n) {
        if ((n & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}
