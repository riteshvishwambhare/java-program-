import java.util.Scanner;

public class identifywebsite {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
String website = sc.nextLine();
if (website.endsWith(".org")) {
    System.out.println("this is organizational website");
}
else if (website.endsWith(".com")) {
   System.out.println("thise is commercial website"); 
}
else if (website.endsWith(".in")) {
  System.out.println("thise is indian website");  
}
}
}
