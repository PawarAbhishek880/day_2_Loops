import java.util.Scanner;

public class Operator_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter month number : ");
        int month = sc.nextInt();
        System.out.println("Enter date: ");
        int date = sc.nextInt();

        boolean isSpringSeason = (month == 3 && date >= 20 && date <= 31) ||
                (month == 4 && date >= 1 && date <= 30) ||
                (month == 5 && date >= 1 && date <= 31) ||
                (month == 6 && date >= 1 && date <= 20);
        System.out.println( isSpringSeason);

    }
}
