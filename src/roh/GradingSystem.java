package roh;

import java.util.Scanner;

/**
 * Java Program to print grade of a student
 */
public class GradingSystem 
{
    public static void main(String[] args) 
    {
        int count, i;
        float totalMarks = 0, percentage = 0, average;
        Scanner scanner; //(Scanner = Scanner)
        scanner = new Scanner(System.in);
 
        System.out.println("Enter Number of Subject");
        count = scanner.nextInt(); // total sub =count
 
        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++)
        {
        	
            totalMarks += scanner.nextInt();  //Assignment operator (+=) for sum of all given i
        }
       
        System.out.println("Total Marks : " + totalMarks);
         
        // Each subject is of 100 Marks
        percentage = totalMarks / (count * 100)*100;
        average= (totalMarks/ count);
        System.out.println("average : "+average);
       System.out.println("Percentage (%) : "+percentage);
        
       
       /* Printing grade of a student using switch case statement */
        switch ((int) percentage/10) {
        case 9:
        case 8:	
            System.out.println("Grade : A+ (Excelent)");
            break;
            
        case 7:
            System.out.println("Grade : A (Very Good)");
            break;
            
        case 6:
            System.out.println("Grade : B (Good)");
            break;
            
        case 5:
            System.out.println("Grade : C (Satisfactory)");
            break;
            
        case 4:
        	System.out.println("Grade : D (Sufficient (passed)");
            
        default:
            System.out.println("Grade : E (Fail)");
            System.out.println("Try Next Year ");
            break;
        }
    }
}