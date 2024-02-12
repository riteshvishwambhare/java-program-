import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1");
        int subject1 = sc.nextInt();
        System.out.println("enter marks of subject 2");
        int subject2 = sc.nextInt();
        System.out.println("enter marks of subject 3");
        int subject3 = sc.nextInt();
        System.out.println("enter marks of subject 4");
        int subject4 = sc.nextInt();
        System.out.println("enter marks of subject 5");
        int subject5 = sc.nextInt();

        //calculate total marks
        int total_marks = subject1+subject2+subject3+subject4+subject5;
        int percentage = total_marks/5;
        System.out.println("total marks"+ total_marks);
        System.out.println("percentage"+ percentage +"%");
    }
}
