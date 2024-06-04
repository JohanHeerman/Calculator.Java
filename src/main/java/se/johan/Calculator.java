package se.johan;

import java.util.Scanner;

public class Calculator {

    public static void main( String[] args )
    {

        double number1, number2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");

        number1 = sc.nextDouble();
        number2 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/):");

        char op = sc.next().charAt(0);
        double o = 0;

        switch (op) {
            case '+':
                o = number1 + number2;
                break;
            case '-':
                o = number1 - number2;
                break;
            case '*':
                o = number1 * number2;
                break;
            case '/':
                o = number1 / number2;
                break;

            default:
                System.out.println();

        }
        System.out.println("The final result");
        System.out.println();

        System.out.println(number1 + " " + op + " " + number2 + " = " + o);








    }
}
