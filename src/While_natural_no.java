import java.util.Scanner;

public class While_natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, i = 1;
        System.out.println("Enter the number to find sum: ");
        int number = sc.nextInt();

        while (i <= number)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of first " + number + " is : " + sum);

    }
}
