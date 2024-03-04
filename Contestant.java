import java.util.Arrays;

public class Contestant {
    private String[] name;
    private int[] minute;

    public Contestant(String[] name, int[] minute) {
        this.name = name;
        this.minute = minute;
    }
    public String[] getName() {
        return name;
    }
    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getMinute() {
        return minute;
    }
    public void setMinute(int[] minute) {
        this.minute = minute;
    }

    public void firstContestant() {
        int number = 0;
        for (int i = 1; i < 16; i++) {
            if (minute[i] < minute[number]) {
                number = i;
            }
        }
        System.out.println("Birinci: " + name[number] + " " + minute[number]);
    }

    public void secondContestant() {
        firstContestant();
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 1; i < 16; i++) {
            if (minute[i] < minute[firstNumber]) {
                secondNumber = firstNumber;
                firstNumber = i;
            } else if (minute[i] < minute[secondNumber]) {
                secondNumber = i;
            }
        }
        System.out.println("İkinci:  " + name[secondNumber] + " " + minute[secondNumber]);
    }

    public void thirdContestant() {
        secondContestant();
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;

        for (int i = 1; i < 16; i++) {
            if (minute[i] < minute[firstNumber]) {
                thirdNumber = secondNumber;
                secondNumber = firstNumber;
                firstNumber = i;
            } else if (minute[i] < minute[secondNumber]) {
                thirdNumber = secondNumber;
                secondNumber = i;
            } else if (minute[i] < minute[thirdNumber]) {
                thirdNumber = i;
            }
        }
        System.out.println("Üçüncü:  " + name[thirdNumber] + " " + minute[thirdNumber]);
    }

    public void classifyContestants() {
        int[] classes = new int[16];
        int numbersA = 0, numbersB = 0, numbersC = 0;

        for (int i = 0; i < 16; i++) {
            if (minute[i] >= 200 && minute[i] <= 299) {
                classes[i] = 'A';
                numbersA++;
            } else if (minute[i] >= 300 && minute[i] <= 399) {
                classes[i] = 'B';
                numbersB++;
            } else {
                classes[i] = 'C';
                numbersC++;
            }
        }
        System.out.println("A --> " + numbersA);
        System.out.println("B --> " + numbersB);
        System.out.println("C --> " + numbersC);
    }
}
