import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //thise is while loop
 //   System.out.println("using while loop");
 //    int i=1;
 //       while (i<=100) {
  //          System.out.println(i);
 //           i++;
 //       }
  //      System.out.println("finish running while loop");



        // thise is do while loop
  //      Scanner sc = new Scanner(System.in);
   //     System.out.println("enter the value of n");
   //     int n= sc.nextInt();
  //      System.out.println("using do while loop");
  //      int b =1;
  //      do{
  //          System.out.println(b+ " ");
  //          b++;
  //      }
  //      while(b<=n);
        

  //using for loop
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of n");
int n = sc.nextInt();

System.out.println("using for loop in reverse order");

for(int i=n; i>=0; i--){
    System.out.println(i);

}
    }
}
