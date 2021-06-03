import java.util.Scanner;

public class Task2_1Divisibility {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer number:");
        int a = sc.nextInt();
        if(a%3==0 && a%5==0)    //a%15==0
            System.out.println("Consultadd JAVA Training");
        else if(a%5 == 0)
            System.out.println("JAVA Training");
        else if(a%3 == 0)
            System.out.println("Consultadd");
    }
}
