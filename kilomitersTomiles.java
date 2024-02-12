import java.util.Scanner;

public class kilomitersTomiles {
    public static void main(String args[]){
        float kilo, miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kilometers");
        kilo=sc.nextFloat();
        System.out.println("conversion begin");
        miles = kilo*0.62137119f;
        System.out.println(miles);
    }
}
