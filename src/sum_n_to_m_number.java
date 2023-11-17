import java.util.Scanner;

public class sum_n_to_m_number {
    public static void main(String[] args) {
        int n,m,sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a First Number : ");
        n=input.nextInt();
        System.out.print("Enter Another Number : ");
        m=input.nextInt();
        sum=0;
        for(int i=n;i<=m;i++){
            sum+=i;
        }
        System.out.println(n+" to "+m+ " Sum is : "+sum);

    }
}
