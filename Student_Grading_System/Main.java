public class Main {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        GradeCalculator calculator = new GradeCalculator();

        System.out.println("==================================================");
        System.out.println("   STUDENT GRADE CALCULATOR | DECODELABS P2       ");
        System.out.println("==================================================");

        int numberOfSubjects = inputHandler.getPositiveInt("Enter total number of subjects: ");

        System.out.println("\n--------------------------------------------------");
        for (int i = 1; i <= numberOfSubjects; i++) {
            double mark = inputHandler.getValidMark(i);
            calculator.addMark(mark);
        }

        // Calculations
        double totalMarks = calculator.calculateTotal();
        double maxPossibleMarks = numberOfSubjects * 100.0;
        double averagePercentage = calculator.calculateAveragePercentage();
        String grade = calculator.assignGrade(averagePercentage);
        String status = calculator.getPassFailStatus(averagePercentage);

        // Display Summary Report
        System.out.println("\n==================================================");
        System.out.println("                ACADEMIC REPORT CARD              ");
        System.out.println("==================================================");
        System.out.println("Total Subjects Processed : " + calculator.getSubjectCount());
        System.out.println("Total Marks Obtained     : " + totalMarks + " / " + maxPossibleMarks);
        System.out.printf("Average Percentage       : %.2f%%\n", averagePercentage);
        System.out.println("Assigned Grade           : " + grade);
        System.out.println("Final Status             : " + status);
        System.out.println("==================================================");

        inputHandler.close();
    }
}
