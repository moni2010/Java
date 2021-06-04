import java.util.Scanner;

public class Task3_4SumOfNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(), sum=0;
        System.out.println("Displaying all the numbers : ");
        for(int i=1; i<=n; i++){
            sum += i;
            System.out.print(i+" ");
        }
        System.out.println("\n\nSum of all the numbers: "+sum);
    }
}
