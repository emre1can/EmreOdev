public class GradeBook {


        private String courseName;
        private final int[] grades;

        public GradeBook(String courseName, int[] grades){
            this.courseName = courseName;
            this.grades = grades;
        }
        public String getCourseName() {
            return courseName;
        }
        public void setCourseName(String courseName){
            this.courseName = courseName;
        }
        public void displayMessage(){
            System.out.println("Welcome to the grade book for : " + getCourseName());
           // System.out.println("Welcome to the grade book for : " + this.CourseName());
        }
        public void processGrades(){
            outputGrades();

            System.out.println("Class grade avarage is " + getAvarage());

            System.out.println("Lowest grade is " + getMinimum());

            System.out.println("Highest grade is " + getMaximum());

        }
        public void outputGrades(){
            for (int student = 0; student < grades.length; student++)
                System.out.println("Student " + (student + 1)  + " : " + grades[student]);

        }
        public void  outpuBarChart(){
            int frequency[] = new int[11];

            for (int grade : grades)
                frequency[grade / 10]++;

            for (int count = 0; count < frequency.length; count++){
                if (count != 10)
                    System.out.printf("%02d-%02d : ", (count * 10) , count * 10 + 9);
                else
                    System.out.printf("%5d : " , 100);
                for (int stars = 0; stars < frequency[count]; stars++)
                    System.out.print("*");
                System.out.println();
            }
        }
        public int getMinimum(){

            int lowestGrade = grades[0];

            for (int grade : grades)
                if (grade < lowestGrade)
                    lowestGrade = grade;
            return lowestGrade;

        }
        public int getMaximum(){
            int highestGrade = grades[0];

            for (int grade : grades)
                if (grade > highestGrade)
                    highestGrade = grade;
            return  highestGrade;
        }
        public double getAvarage(){
            int total = 0;
            for (int grade : grades)
                total += grade;
            return (double) total / grades.length;

        }

    }

