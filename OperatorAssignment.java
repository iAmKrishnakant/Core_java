package assignment;

public class OperatorAssignment {
    
    void calculateAreaAndPerimeter() {
        float length = 5.0f;
        float breadth = 7.0f;
        float area = length * breadth;
        float perimeter = 2 * (length + breadth);
        
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
    
    void computeExpression() {
        int sum = 8 + 2345;
        int division = sum / 3;
        int remainder = division % 5;
        int result = remainder * 5;
        
        System.out.println(result);
    }
    
    void compareValues() {
        int firstValue = 55;
        int secondValue = 70;
        boolean isFirstLessThan50 = firstValue < 50;
        boolean isFirstLessThanSecond = firstValue < secondValue;
        
        System.out.println("firstValue < 50: " + isFirstLessThan50);
        System.out.println("firstValue < secondValue: " + isFirstLessThanSecond);
    }
    
    void calculateTotalAndPercentage() {
        float subject1 = 78.0f;
        float subject2 = 45.0f;
        float subject3 = 62.0f;
        
        float totalMarks = subject1 + subject2 + subject3;
        float percentage = totalMarks / 3;
        
        System.out.println("Total Marks: " + totalMarks + " | Percentage: " + percentage);
    }
    
    void calculateGradeAGirls() {
        int totalGradeAStudents = 45;
        int gradeABoys = 20;
        int gradeAGirls = totalGradeAStudents - gradeABoys;
        
        System.out.println("Total boys with Grade A: " + gradeABoys);
        System.out.println("Total girls with Grade A: " + gradeAGirls);
    }
    
    public static void main(String[] args) {
        OperatorAssignment assignment = new OperatorAssignment();
        
        assignment.calculateAreaAndPerimeter();
        assignment.computeExpression();
        assignment.compareValues();
        assignment.calculateTotalAndPercentage();
        assignment.calculateGradeAGirls();
    }
}
