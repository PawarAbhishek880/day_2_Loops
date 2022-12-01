import java.util.Scanner;

public class Unit_tens{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int thousand;
        int hundreds;
        int tens;
        int units;

        System.out.println("Enter 4 digit number: ");
        int number = input.nextInt();

        if(number <=9999 && number>999){
            thousand = number / 1000;
            System.out.println("Thousand place digit: " + thousand);

            hundreds = (number / 100) % 10;
            System.out.println("Hundreds place digit: " + hundreds);

            tens = (number / 10) % 10;
            System.out.println("Tens place digit is : " + tens);

            units = (number % 10);
            System.out.println("Units place digit is : " + units);
        }
        else{
            if (number>9999)
                System.out.println("Please enter valid digits. ");
                if (number<1000)
                    System.out.println("Enter 4 digit number");
        }
    }

}