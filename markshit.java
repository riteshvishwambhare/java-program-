import java.io.DataInputStream;
import java.io.IOException;

public class markshit {
public static void main(String args[]){
    int m1,m2,m3,m4,m5,total;
    float per;
    String Sname;
    try{
        DataInputStream obj = new DataInputStream(System.in);
        System.out.println("enter student name");
        Sname=obj.readLine();
        System.out.println("\n enter subject name");
        m1 =Integer.parseInt(obj.readLine());
        System.out.println("\n enter subject 2 merk");
        m2 =Integer.parseInt(obj.readLine());
        System.out.println("\n enter subject 3 marks");
        m3 =Integer.parseInt(obj.readLine());
        System.out.println("\n enter subject 4 marks");
        m4 =Integer.parseInt(obj.readLine());
        System.out.println("\n enter subject 5 marks");
        m5 =Integer.parseInt(obj.readLine());
        total=m1+m2+m3+m4+m5;
        per=total/5;
        System.out.println("total is ="+total);
        System.out.println("persentage is ="+per);
        if(per<50) {
            System.out.println("grade is C");
        }
        else if (per > 50 && per <= 80) {
            System.out.println("grade is B");
        }
        else{
            System.out.println("gade is A");
        }
        if (m1>=35 && m2>=35 && m3>=35 && m4>=35 && m5>=35) {
            System.out.println("congratulation " +Sname + "you are pass !");
        }
        else {
            System.out.println("sorry" +Sname +"you are fail try again");
        }
    }
    catch(IOException er){}
}
}
