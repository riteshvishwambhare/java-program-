
import java.util.Scanner;
public class leafyear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println("enter a year");
        if ((year % 4==0 &&year%100 !=0  )||( year % 400==0)) {
            System.out.println(year + "is a leaf year");
        }
            else    
            {
                System.out.println(year +"is not a leaf year");
            }
        }
    }

