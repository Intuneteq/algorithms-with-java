package algorithms;

import java.util.Scanner;

/**
 *
 * @author Tobi Olanitori
 */
public class Algorithms {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 0, b = 1, c = a + b, n;

        System.out.println("Enter position of number: ");
        n = console.nextInt();

        for (int i = n - 2; i > 0; i--) {
            a = b;
            b = c;
            c = b + a;
        }

        System.out.println("The number at position " + n + " of a fibonacci series is " + c);
    }

    public static void factorialOfNumber() {
        int n;
        long factorial = 1;

        System.out.println("Enter a number: ");
        n = console.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("The Factorial of " + n + " is " + factorial);
    }

    public static void displayDigitsInReverse() {
        int n;

        System.out.println("Enter a number: ");
        n = console.nextInt();

        while (n > 0) {
            int r = n % 10;

            n = n / 10;

            System.out.println(r);
        }
    }

    public static void countNumberOfDigits() {
        int n;
        int count = 0;

        System.out.println("Enter a number: ");
        n = console.nextInt();

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }

    /**
     * An Armstrong number is a number that will return the same value when the
     * cube of each digit is summed. E.g 1^3 * 5^3 * 3^3 = 153;
     */
    public static void checkIfArmstrongNumber() {
        int n;
        int armstrong = 0;

        System.out.println("Enter a number: ");
        n = console.nextInt();
        int oldValue = n;

        while (n > 0) {
            int r = n % 10;

            n = n / 10;

            armstrong = armstrong + (r * r * r);
        }

        if (armstrong == oldValue) {
            System.out.println(n + " is an armstrong number");
        } else {
            System.out.println(n + " is not an armstrong number");
        }
    }

    public static int reverseNumber(int n) {
        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            n = n / 10;

            rev = rev * 10 + r;
        }

        System.out.println(rev);

        return rev;
    }

    public static void palindrome() {
        int n;

        System.out.println("Enter a number: ");
        n = console.nextInt();

        int rev = reverseNumber(n);

        if (rev == n) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    public static void printDigitsInWords() {
        int n, r;
        String revStr = "";
        char num;

        System.out.println("Enter a number: ");
        n = console.nextInt();

        while (n > 0) {
            r = n % 10;
            n = n / 10;

            revStr = revStr + r;
        }

        for (int i = revStr.length() - 1; i >= 0; i--) {
            num = revStr.charAt(i);

            switch (num) {
                case '0' ->
                    System.out.println("Zero");
                case '1' ->
                    System.out.println("One");
                case '2' ->
                    System.out.println("Two");
                case '3' ->
                    System.out.println("Three");
                case '4' ->
                    System.out.println("Four");
                case '5' ->
                    System.out.println("Five");
                case '6' ->
                    System.out.println("Six");

                case '7' ->
                    System.out.println("Seven");

                case '8' ->
                    System.out.println("Eight");

                case '9' ->
                    System.out.println("Nine");
                default ->
                    System.out.println("Not a Number");
            }
        }
    }

    public static void wordPalindrome() {
        String str;
        String rev = "";

        System.out.println("Enter a Word: ");
        str = console.next();
        String prevWord = str;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (prevWord.equals(rev)) {
            System.out.println(prevWord + " is a palindrome");
        } else {
            System.out.println(prevWord + " is not a palindrome");
        }
    }

    public static void arithmeticProgression() {
        int num, diff, term;

        System.out.println("Enter starting number: ");
        num = console.nextInt();

        System.out.println("Enter a common difference: ");
        diff = console.nextInt();

        System.out.println("Enter a number of times: ");
        term = console.nextInt();

        for (int i = 1; i <= term; i++) {
            System.out.print(num + ", ");
            num = num + diff;
        }
    }

    public static void geometricProgression() {
        int num, ratio, term;

        System.out.println("Enter starting number: ");
        num = console.nextInt();

        System.out.println("Enter a common ratio: ");
        ratio = console.nextInt();

        System.out.println("Enter a number of times: ");
        term = console.nextInt();

        for (int i = 1; i <= term; i++) {
            System.out.print(num + ", ");
            num = num * ratio;
        }
    }

    public static void fibonacciSeries() {
        int a = 0, b = 1, c = a + b, n;

        System.out.println("Enter number of series: ");
        n = console.nextInt();

        System.out.print(a + ", " + b + ", ");
        for (int i = n - 2; i > 0; i--) {
            System.out.print(c + ", ");
            a = b;
            b = c;
            c = b + a;
        }
    }

    public static void numberAtPositionOfFibonacciSeries() {
        int a = 0, b = 1, c = a + b, n;

        System.out.println("Enter position of number: ");
        n = console.nextInt();

        for (int i = n - 2; i > 0; i--) {
            a = b;
            b = c;
            c = b + a;
        }

        System.out.println("The number at position " + n + " of a fibonacci series is " + c);
    }

}
