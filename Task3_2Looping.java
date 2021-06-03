import java.util.Scanner;

public class Task3_2Looping {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<10; i++){
            System.out.println("Enter the "+(i+1)+" value in the array: ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<10; i++)
            sum += arr[i];
        float avg = (float)sum/10;
        System.out.println("Sum of 10 values in the array: "+sum);
        System.out.println("Average of 10 values in the array: "+avg);
        
    }
}
