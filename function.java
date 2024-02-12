import java.util.Scanner;

public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner os=new Scanner(System.in);
        String name = os.next();
        printMyName(name);

    }
}
