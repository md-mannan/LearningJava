import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Assignment
//        1 .Take Input from User and inform him its Vowel or Consonant
//        make same task by switch

      char ch;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter A Character :");
        ch=input.next().charAt(0);

        if (ch>='a' && ch<='z' || ch>='A' && ch<='Z' ){
            switch (ch){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.print("'"+ch+"'  is a Vowel");
                    break;
                default:
                    System.out.print("'"+ch+"'  is a Consonant");
            }

        }else {
            System.out.print("It a not a letter");
        }


    }
}