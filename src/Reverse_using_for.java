import java.util.Scanner;

public class Reverse_using_for {
    public static void main(String[] args) {

        int remainder , reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to print in reverse order : ");
        int number = sc.nextInt();

        for( ; number != 0 ; )
        {
            remainder = number % 10;                //1234%10 = 4
            reverse = reverse * 10 + remainder;     // 0*10 + 4 = 4 we will just store this in reverse
            number = number / 10;                   // here we will lower the digit by 1 means 1234 we be 123
        }
        System.out.println("Entered number in reverse format is : " + reverse);
    }
}