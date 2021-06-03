import java.util.Scanner;

public class Task2_7FloatingPoint {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating point number");
        float num = sc.nextFloat();
        if(num == 0.0)
            System.out.println("Zero");
        int absVal = (int)num;
        //System.out.println(absVal);
        if(absVal < 0)
            System.out.println("small");
        else
            System.out.println("large");
    }
}
