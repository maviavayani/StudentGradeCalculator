import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a mark obtained (out of 100) in each subject.");
        System.out.println("Enter Math marks:");
        int Math=sc.nextInt();

        System.out.println("Enter English Marks:");
        int English = sc.nextInt();

        System.out.println("Enter Computer Marks:");
        int Computer = sc.nextInt();

        System.out.println("Enter Science Marks:");
        int Science = sc.nextInt();

        System.out.println("Enter Urdu Marks:");
        int Urdu = sc.nextInt();

        int totalmarks = Math + English + Science + Computer + Urdu;
        System.out.println("Total Marks is :" + totalmarks);
        double percntage = totalmarks/5.0;
        System.out.println("Average percentage is : " +percntage);

        if (percntage>90) {
            System.out.println("A+ Grade");
        }
        else if (percntage>85) {
            System.out.println("A Grade");
        }
        else if (percntage>80) {
            System.out.println("B+ Grade");
        }
        else if (percntage>75) {
            System.out.println("B Grade");
        }
        else if (percntage>65) {
            System.out.println("C+ Grade");
        }
        else if (percntage>60) {
            System.out.println("C Grade");
        }
        else if (percntage>55) {
            System.out.println("C- Grade");
        }
        else{
            System.out.println("F Grade");
        }
    }
}
