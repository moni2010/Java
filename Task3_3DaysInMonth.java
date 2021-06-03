import java.util.HashMap;
import java.util.Scanner;

public class Task3_3DaysInMonth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 12 to find month: ");
        int n_month = sc.nextInt();
        //String s_month = String.valueOf(n_month);
        //System.out.println(type(s_month);
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //HashMap<String , Integer> hm1 = new HashMap<String, Integer>();
        hm.put(1, "January");
        hm.put(2, "February");
        hm.put(3, "March");
        hm.put(4, "April");
        hm.put(5, "May");
        hm.put(6, "June");
        hm.put(7,"July");
        hm.put(8,"August");
        hm.put(9,"September");
        hm.put(10,"October");
        hm.put(11,"November");
        hm.put(12,"December");
        //System.out.println(hm.getKey(1));
        //if(hm.keySet())
        /* for ( Integer key : hm.keySet() ) {
            if(key==1 || key==3|| key==5|| key==7|| key==8|| key==10|| key==12)
                System.out.println("There are 31 days in "+hm.get(key) );
        } */
        if(n_month==1 || n_month==3|| n_month==5|| n_month==7|| n_month==8|| n_month==10|| n_month==12)
            System.out.println("There are 31 days in "+hm.get(n_month) );
        else if(n_month==4 || n_month==6|| n_month==9|| n_month==11)
            System.out.println("There are 30 days in "+hm.get(n_month) );
        else if(n_month==2)
            System.out.println("There are 28 or 29 days in "+hm.get(n_month) );
        else
            System.out.println("Invalid month");
    }
}
