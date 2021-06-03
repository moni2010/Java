import java.util.Scanner;

public class Task2_4BreakContinue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter any number: ");
            int a = sc.nextInt();
            if(a<0){
                System.out.println("It's Over");
                break;
            }

            else{
                System.out.println("Good Going");
                continue;
            }
        }
    }
}
