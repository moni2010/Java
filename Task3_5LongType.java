import java.util.Scanner;

public class Task3_5LongType {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        long n = sc.nextLong(), r, sum=0;
        int count=0;
        while(true){
            if(n==0)
                break;
            r = n % 10;
            sum += r;
            n = n / 10;
            count++;

        }
        System.out.println("The number of digits in the number: "+count+"\nThe sum of all the digits in the given number: "+sum);
    }
}
