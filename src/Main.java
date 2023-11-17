import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Assignment
//        1 .Take Input from User and inform him its Vowel or Consonant
      char ch;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter A Character :");
        ch=input.next().charAt(0);
        if(ch=='a' ||ch=='A' || ch=='e' ||ch=='E' ||ch=='i' ||ch=='o' ||ch=='O' ||ch=='u' || ch=='U'){
            System.out.print(ch+" is a Vowel");
        }else {
            System.out.print(ch+" is a Consonant");
        }
    }
}