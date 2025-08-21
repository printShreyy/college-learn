import java.util.Scanner;

class calc {

    void calcM(int a, int b,char op) {
        if (op == '+'){
            System.out.println("The addition of two number is " + (a+b));
        } else if (op == '-') {
            System.out.println("The subtraction of two number is " + (a-b));
        } else if (op == '*') {
            System.out.println("The multiplication of two number is " + (a*b));
        } else if (op == '/') {
            System.out.println("The division of two number is " + (a/b));
        }

    }

}

public class calcMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = input.nextInt();
        System.out.println("Enter number 2: ");
        int b = input.nextInt();
        System.out.println("Enter the operator(+,-,*,/):");
        char op = input.next().charAt(0);

        calc obj = new calc();
        obj.calcM(a,b,op);

    }

}
