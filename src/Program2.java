import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int num1, num2,large;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Number : ");
        num1=input.nextInt();
        num2=input.nextInt();
large=(num1>num2) ? num1:num2;
System.out.print("Large Number is "+large);

    }
}
