
import java.util.Scanner;
public class switchweekday {
    public static void main(String args[]){
        System.out.println("enter day of week");
    Scanner sc = new Scanner(System.in);
   int days= sc.nextInt();
    switch(days){
         case 1 -> System.out.println("sunday");
        case 2 -> System.out.println("monday");
        case 3 -> System.out.println("tuesday");
        case 4 -> System.out.println("Wednesday");
        case 5 -> System.out.println("thursday");
        case 6 -> System.out.println("friday");
        case 7 -> System.out.println("saturday");
    }
}
}