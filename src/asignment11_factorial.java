import java.util.Scanner;

public class asignment11_factorial {

    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Input A Number to know Factors and Factorial of Numbers: ");
        n=input.nextInt();
        input.close();
        long factorial=1;
        int i;
        for(i=1;i<=n;i++){
           factorial*=i;

        }
        System.out.println("Factorial n=" +n +" is "+factorial);

        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+"\t");
            }
        }
    }
}
