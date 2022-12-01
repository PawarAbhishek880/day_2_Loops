import java.util.Scanner;

public class Ope_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number: ");
        int a=sc.nextInt();

        System.out.println(" Enter the second number: ");
        int b=sc.nextInt();

        System.out.println(" Enter the third number: ");
        int c=sc.nextInt();

        int prb1, prb2, prb3, prb4;
        prb1 = a + b * c;
        prb2 = c + a / b;
        prb3 = a % b + c;
        prb4 = a * b + c;

        System.out.println("prb1 = "+ prb1 + "\n prb2 = " + prb2 + "\n prb3 = "+ prb3 + "\n prb4 = "+ prb4);
        System.out.println("Finding Maximum: ");

        if (prb1 > prb2 && prb1 > prb3 && prb1 > prb4) {
            System.out.println("The Maximum value  is prb1 = " + prb1);
        }
        else if  (prb2 > prb1 && prb2 > prb3 && prb2 > prb4) {
            System.out.println("The Maximum value is prb2 = " + prb2);
        }
        else if  (prb3 > prb1 && prb3 > prb2 && prb3 > prb4) {
            System.out.println("The Maximum value is prb3 = " + prb3);
        }
        else
            System.out.println("The Maximum value is prb4 = " + prb4);


        System.out.println("Finding Minimum: ");

        if (prb1 < prb2 && prb1 < prb3 && prb1 < prb4) {
            System.out.println("The Minimum value is prb1 = " + prb1);
        }
        else if  (prb2 < prb1 && prb2 < prb3 && prb2 < prb4) {
            System.out.println("The Minimum value is prb2 = " + prb2);
        }
        else if  (prb3 < prb1 && prb3 < prb2 && prb3 < prb4) {
            System.out.println("The Minimum value is prb3 = " + prb3);
        }
        else
            System.out.println("The Minimum value is prb4 = " + prb4);
    }
}
