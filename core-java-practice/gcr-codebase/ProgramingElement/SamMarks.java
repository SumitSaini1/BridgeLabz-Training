public class SamMarks {
    public static void Average() {
        int Maths = 94;
        int Physics = 95;
        int Chemistry = 96;
        double avarage = (Maths + Physics + Chemistry) / 3.0; // Sum of all marks and divide by no of subjects marks
        System.out.println("Sam’s average mark in PCM is " + avarage);

    }
    public static void main(String[] args) {
        SamMarks.Average();
    }
    
}
