import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    static int even = 0;
    static int odd = 0;

    public static void eoCount(int numba) {
        if (numba % 2 == 0) {
            even = even + 1;
        } else {
            odd = odd + 1;
        }
    }

    public static double mean(int sum, int count) {
       return (1.0 * sum) / count;
    }

    public static void main(String[] args) {

        String l;
        System.out.println("Input a number to add or 'q' to quit: ");
        int sum = 0;
        int count = 0;
        while(!(l = s.nextLine()).equalsIgnoreCase("Q")) {
            int input = Integer.parseInt(l);
            eoCount(input);
            sum += input;
            count++;
        }
        mean(sum, count);
        System.out.printf("Even count %d, Odd count %d%n", even, odd);
        System.out.printf("Your sum is %d, The total numbers are %d", sum, count);
    }
}
