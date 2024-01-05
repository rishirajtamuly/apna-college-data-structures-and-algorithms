// Check if a student will pass or fail

import java.util.*;

public class StudentResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        sc.close();
        String reportCard = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
}
