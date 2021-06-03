import java.util.Scanner;

public class Task3_1MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter any number to print the multiplication table. Press 0 to exit");
            int num = sc.nextInt();
            if(num==0)
                System.exit(0);
            System.out.println("Multiplication Table of: "+num);
            for(int i =1; i<=10; i++){
                System.out.println(num+" * "+i+" = "+num*i);
            }
        }
    }
}
