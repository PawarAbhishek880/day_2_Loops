import java.util.Scanner;

public class Operator_3 {
    public static void main(String[] args) {
        System.out.println("Program to find roots of quadratic equation a*x*x + b*x + c");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value for b: ");
        int b = sc.nextInt();

        System.out.println("Enter the value for c: ");
        int c = sc.nextInt();

        System.out.println("Therefor the given quadratic equation becomes "
                            + a + "*x*x " + b + "*x +" + c);

        double eq1 = b*b - 4*a*c;
        double root1 =  ((-b + Math.sqrt(eq1)) / (a * 2));
        double root2 =  ((-b - Math.sqrt(eq1)) / (a * 2));

        System.out.println("First root the following equation is: " + root1);
        System.out.println("Second root the following equation is: " + root2);

    }
}
