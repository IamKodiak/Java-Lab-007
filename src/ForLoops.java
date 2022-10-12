import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    static int sumsum = 0;
    static int rangesum = 0;
    static int factoration = 1;


    public static void forSum(int input) {
        for (int i = 1; i <= input; i++) {
            sumsum = sumsum + i;
        }
    }


    public static void rangeSum(int input1, int input2) {
        if (input1 < input2) {
            for (int i = input1; i <= input2; i++) {
                rangesum = rangesum + i;
            }
        } else {
            for (int i = input2; i <= input1; i++) {
                rangesum = rangesum + i;
            }
        }
    }


    public static void factorial(int input) {
        for (int i = input; i >= 1; i--) {
            factoration = factoration * i;
        }
    }


    public static void main(String[] args) {
        System.out.println("Number for sum?");
        int sumsumInput = s.nextInt();
        forSum(sumsumInput);
        System.out.printf("The sum is %d%n%n", sumsum);

        System.out.println("First number for range sum?");
        int rsInput1 = s.nextInt();
        System.out.println("Second number for range sum?");
        int rsInput2 = s.nextInt();
        rangeSum(rsInput1,rsInput2);
        System.out.printf("The sum is %d%n%n", rangesum);

        System.out.println("Number for factorial?");
        int fInput = s.nextInt();
        factorial(fInput);
        System.out.printf("The factorial is %d", factoration);
    }
}
