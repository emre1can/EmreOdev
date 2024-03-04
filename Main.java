public class Main {
    public static void main(String[] args) {

        String[] nameArray = {"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak" };
        int[] minuteArray = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};

        Contestant contestants = new Contestant(nameArray, minuteArray);

        contestants.thirdContestant();
        contestants.classifyContestants();

    }
}