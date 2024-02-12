import java.util.Scanner;
public class Conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b) {
            System.out.println("equal");
        } 
       else if(a > 18) 
       {
            System.out.println("a is greater");
        }
                else {
            System.out.println("a is lesser");
        }


    }

    
}