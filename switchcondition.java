import java.util.Scanner;
public class switchcondition {
    public static void main(String args[]){
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("you are adult");
                break;
            case 12:
                System.out.println("you are in underage");
                break;
            case 24:
                System.out.println("you are eligible for job");
                break;
            default:
            System.out.println("enjoy your life");
                break;
        }
    }
}
