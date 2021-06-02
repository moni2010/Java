import java.util.Scanner;

public class PrintValue {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String username = sc.nextLine();
        System.out.println("Hello, "+username+"!");
    }
}
