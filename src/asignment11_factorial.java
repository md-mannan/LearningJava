import java.util.Scanner;

public class asignment11_factorial {

    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Input A Number : ");
        n=input.nextInt();
        long factorial=1;
        int i;
        for(i=1;i<=n;i++){
           factorial*=i;

        }
        System.out.println("Factorial n=" +n +" is "+factorial);
    }
}
