import java.util.Scanner;

public class For_natural_no {
    public static void main(String[] args) {
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum : ");
        int number = sc.nextInt();

        for(int i = 0 ; i <= number ; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of first " + number + " is : " + sum);
    }
}
