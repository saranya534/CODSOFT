package codsoft;
import java.util.*;
    public class StudentGradeCalculator {
		    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   int total = 0;
   System.out.print("Enter number of subjects: ");
    int n = sc.nextInt();

for (int i = 1; i <= n; i++) {
 System.out.print("Enter marks obtained in subj "+i+":");
		  total+=sc.nextInt();
		        }

float avg=total/(float) n;
String grade;

 if (avg >= 90)
	 System.out.println(" grade:A+");
 else if (avg >= 80)
	 System.out.println("grade:A");
 else if (avg >= 70)
	 System.out.println("grade:B");
 else if (avg >= 60)
	 System.out.println("grade:C");
 else if (avg >= 50)
	 System.out.println("grade:D");
else
     grade = "F";
 System.out.println("Total:"+ total);
 System.out.println("average:"+ avg);
 //System.out.println("Grade:"+ grade);
 sc.close();
		    }
		

}
