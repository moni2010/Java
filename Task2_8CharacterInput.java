import java.util.Scanner;

public class Task2_8CharacterInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String ch = sc.next();
        //String str1 = new String("r");

        if("r".equalsIgnoreCase(ch) || "a".equalsIgnoreCase(ch) || "n".equalsIgnoreCase(ch) || "d".equalsIgnoreCase(ch) || "o".equalsIgnoreCase(ch) || "m".equalsIgnoreCase(ch))
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");

    }
}
