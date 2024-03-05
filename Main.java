public class Main {
    public static void main(String[] args) {

        int[] gradesArray = {87,68,94,100,83,78,85,91,76,87,25};

        GradeBook myGradeBook = new GradeBook("Programlama" , gradesArray);
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
        myGradeBook.outpuBarChart();
    }
}