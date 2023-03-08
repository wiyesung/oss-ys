package HelloTest;
import java.util.Scanner;

public class HelloTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int a, b1, b2, b3;
        a = sc.nextInt();

        b1 = sc.nextInt();
        b2 = sc.nextInt();
        b3 = sc.nextInt();

        int first, second, third, last;
        first = a * b3;
        second = a* b2;
        third = a* b1;
        last = first + second + third;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(last);




    }
}
