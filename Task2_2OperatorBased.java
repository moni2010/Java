import java.util.Scanner;

public class Task2_2OperatorBased {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose from the following options:\n1 - Addition\n2 - Subtraction\n3 - Division\n4 - Multiplication\n5 – Average\nEnter a number between 1 and 5: ");
        int option = sc.nextInt();
        float first,second;
        float answer;
        System.out.println("Enter first number: ");
        first = sc.nextInt();

        System.out.println("Enter second number: ");
        second = sc.nextInt();

        switch (option){
            case 1: answer = first + second;
                    if(answer<0) {System.out.println("Opps option "+option+":Addition is returning the negative number");}
                    else{System.out.println("Addition : "+answer);}
                    break;
            case 2: answer = first - second;
                    if(answer<0) {System.out.println("Opps option "+option+":Subtraction is returning the negative number");}
                    else{System.out.println("Subtraction : "+answer);}
                    break;
            case 3: answer = first / second;
                    if(answer<0) {System.out.println("Opps option "+option+":Division is returning the negative number");}
                    else{System.out.println("Division : "+answer);}
                    break;
            case 4: answer = first * second;
                    if(answer<0) {System.out.println("Opps option "+option+":Multiplication is returning the negative number");}
                    else{System.out.println("Multiplication : "+answer);}
                    break;
            case 5: System.out.println("Enter first1 number: ");
                    int first1 = sc.nextInt();
                    System.out.println("Enter second2 number: ");
                    int second2 = sc.nextInt();
                    answer = (first + second + first1 + second2)/4;
                    if(answer<0) {System.out.println("Opps option "+option+":Average is returning the negative number");}
                    else{System.out.println("Average : "+answer);}
                    break;
            default: System.out.println("Invalid option");
        }
    }
}
