import java.util.Scanner;

public class Task2_6ConditionalActions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = sc.nextInt();
        if(a%3 == 0)
            System.out.println("NEW");
        else if(a%2 == 0 && a>=2 && a<=5)
            System.out.println("OLD");
        else if(a%2 == 0 && a>=6 && a<=30)
            System.out.println("NEW");
        else if(a%2 == 0 && a>30)
            System.out.println("OLD");

    }
}
