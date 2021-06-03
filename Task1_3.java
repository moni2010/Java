import java.util.Scanner;

public class Task1_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers between 1 and 10:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x + y;
        int results = z + 30;
        System.out.println("Final results: "+results);

    }
}
