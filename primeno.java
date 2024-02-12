import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class primeno {
    public static void main(String args[]){
        int n,i,flag=0;
        try{
            Scanner os= new Scanner(System.in);
            n=Integer.parseInt(os.readLine());
            for(i=2;i<n;i++){
                if (n%i==0) {
                    flag=1;
                    break;
                }
            }
            if (flag==1) {
                System.out.println("number is not prime");
            } else {
                System.out.println("number is prime");
            }
        }
        catch(IOException er){}
    }
    
}
