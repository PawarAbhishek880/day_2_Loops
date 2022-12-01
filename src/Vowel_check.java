import java.util.Scanner;

public class Vowel_check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet to check weather it is vowel or consonant: ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println(ch + " is an Vowel");
                break;
            default :
                System.out.println(ch + " is a Consonant");
                break;
        }
    }
}
