import java.util.Scanner;
/**
 * Student_Grade_calculator
 */
public class Student_Grade_calculator {

    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();
        int totalMarks=0;
        for(int i=1;i<=numSubjects;i++)
        {
            System.out.println("Enter marks obtained in subjects:"+i+":");
                totalMarks+=sc.nextInt();
        }
        double averagePercentage = (double)totalMarks/numSubjects;
        System.out.println("Total marks:"+totalMarks);
        System.out.println("Average Percentage:"+averagePercentage);

        String grade = calculatorGrade(averagePercentage);
        System.out.println("Grade:"+grade);
    }
    public static String calculatorGrade(double averagePercentage)
    {
        if (averagePercentage>=90)
        {
            return "A+";
        }
        else if (averagePercentage>=80)
        {
            return "A";
        }
        else if (averagePercentage>=70)
        {
            return "b";

        }
        else if (averagePercentage>=60)
        {
            return "c";

        }
        else if (averagePercentage>=50)
        {
            return "D";
        }
        else
        {
            return "Fail";
        }
    }
}