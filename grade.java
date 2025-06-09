import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");
        } else {
           
            int grade= marks / 10;

            switch (gradeCategory) {
                case 10: 
                case 9:                     
                        System.out.println("Grade: A");
                    break;
                case 8:  
                case 7:                   
                      if (marks >= 75) {
                        System.out.println("Grade: B");
                    } else {
                        System.out.println("Grade: C");
                    }
                    break;
                case 6:  
                    System.out.println("Grade: C");
                    break;
                default: 
                    System.out.println("Grade: D");
                    break;
            }
        }

        sc.close();
    }
}









