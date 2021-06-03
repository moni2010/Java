import java.util.Scanner;

public class SwapNumbers {
    //Method 1: by using third variable...
    static void method1(int a, int b){
        int result;
        result = a; a = b; b = result;
        System.out.println("Swapping the numbers using third variable: "+a+" " + b);
    }

    //Method 2: without using the third variable...
    static void method2(int a, int b){
       a = a + b;
       b = a - b;
       a = a - b;
       System.out.println("Swapping the numbers without using third variable: "+a+" " + b);
    }
    public static void main(String args[]){
        System.out.println("Enter values for a and b:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        method1(a,b);
        method2(a,b);
    }
}
