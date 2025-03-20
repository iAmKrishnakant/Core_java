package assignment;

public class ArrayAssignment {

    void calculateArraySum() {
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5487, 278};
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
 

    void calculateAverageValue() {
        float sum = 0;
        int[] numbers = {1, 2, 3, 4, 5487, 278};
        for (int num : numbers) {
            sum += num;
        }
        float average = sum / numbers.length;
        System.out.println("Average: " + average);
        System.out.println();
        System.out.println();
        System.out.println();
    }
    

    void printAllOddNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    void printAllEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    void sumFirstFiveEvenNumbers() {
        int[] numbers = {5, 21, 44, 22, 54, 1, 20, 50, 42, 80};
        int total = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0 && count < 5) {
                total += num;
                count++;
            }
        }
        System.out.println("Sum of first five even numbers: " + total);
    }

    void sumOfEvenNumbers() {
        int total = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : numbers) {
            if (num % 2 == 0) {
                total += num;
            }
        }
        System.out.println("Sum of even numbers: " + total);
    }

    void sumOfNegativeNumbers() {
        int total = 0;
        int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9};
        for (int num : numbers) {
            if (num < 0) {
                total += num;
            }
        }
        System.out.println("Sum of negative numbers: " + total);
    }

    void sumRowsAndColumnsOfMatrix() {
        int rowSum[] = new int[3];
        int colSum[] = new int[3];
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }
        
        System.out.println("Row Sums: " + rowSum[0] + ", " + rowSum[1] + ", " + rowSum[2]);
        System.out.println("Column Sums: " + colSum[0] + ", " + colSum[1] + ", " + colSum[2]);
    }
    private void syso() {
		// TODO Auto-generated method stub
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	System.out.println();
	}
    
    
    public static void main(String[] args) {
        ArrayAssignment assignment = new ArrayAssignment();
        // assignment.calculateArraySum();
        // assignment.calculateAverageValue();
        // assignment.printAllOddNumbers();
        // assignment.printAllEvenNumbers();
        // assignment.sumFirstFiveEvenNumbers();
        // assignment.sumOfEvenNumbers();
        // assignment.sumOfNegativeNumbers();
        // assignment.sumRowsAndColumnsOfMatrix();
    }
}
