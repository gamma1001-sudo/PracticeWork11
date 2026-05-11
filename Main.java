import java.util.Scanner;

public class Main {

    // Задание 2
    // От 1 до n

    public static void printNumbers(int n) {

        if (n == 1) {

            System.out.print(1 + " ");

            return;
        }

        printNumbers(n - 1);

        System.out.print(n + " ");
    }


    // Задание 5
    // Сумма цифр числа

    public static int sumDigits(int n) {

        if (n < 10) {

            return n;
        }

        return n % 10 + sumDigits(n / 10);
    }


    // Задание 8
    // Палиндром

    public static boolean isPalindrome(
            String str,
            int left,
            int right
    ) {

        if (left >= right) {

            return true;
        }

        if (str.charAt(left)
                !=
                str.charAt(right)) {

            return false;
        }

        return isPalindrome(
                str,
                left + 1,
                right - 1
        );
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Задание 2

        System.out.println(
                "Числа от 1 до n:"
        );

        printNumbers(5);

        System.out.println();


        // Задание 5

        System.out.println(
                "\nСумма цифр:"
        );

        int number = 12345;

        System.out.println(
                number
                        + " -> "
                        + sumDigits(number)
        );


        // Задание 8

        System.out.println(
                "\nПалиндром:"
        );

        String word = "level";

        if (isPalindrome(
                word,
                0,
                word.length() - 1
        )) {

            System.out.println(
                    word + " YES"
            );

        } else {

            System.out.println(
                    word + " NO"
            );
        }

        scanner.close();
    }
}