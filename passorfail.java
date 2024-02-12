import java.util.Scanner;
public class passorfail {
    public static void main(String args[]){
        int m1,m2,m3;
    Scanner sc = new Scanner(System.in);

    System.out.println("enter marks of mathemathics");
    m1 = sc.nextInt();
   
    System.out.println("enter marks of chemistry");
    m2 = sc.nextInt();
    
    System.out.println("enter marks of physics");
    m3 = sc.nextInt();
    float avg = (m1+m2+m3)/ 3.0f;
    System.out.println("your overall percentage is"+avg);
    if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
        System.out.println("congratulation you are pass");
    }
    else
    System.out.println("sorry you are fail! try again" );

    }
}
