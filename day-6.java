public class Day6_GPACalculator {
    public static void main(String[] args) {
        String[] grades = {"A", "B+", "A-", "B"};
        int[] credits = {3, 4, 3, 2}; 
        double totalPoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < grades.length; i++) {
            double gradePoint = 0;
            switch (grades[i]) {
                case "A": gradePoint = 4.0; break;
                case "A-": gradePoint = 3.7; break;
                case "B+": gradePoint = 3.3; break;
                case "B": gradePoint = 3.0; break;
                case "B-": gradePoint = 2.7; break;
                case "C+": gradePoint = 2.3; break;
                case "C": gradePoint = 2.0; break;
                case "C-": gradePoint = 1.7; break;
                case "D": gradePoint = 1.0; break;
                default: gradePoint = 0.0;
            }
            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }
        double gpa = totalPoints / totalCredits;
        System.out.printf("Your GPA is: %.2f\n", gpa);
    }
}
