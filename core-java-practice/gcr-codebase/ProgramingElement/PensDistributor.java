public class PensDistributor {
    public static void calculatePens() {
        int numberOfPens = 14;
        int numberOfStudents = 3;
        int remainingPens = numberOfPens % numberOfStudents; // find remaing pens
        int distributedPens = numberOfPens - remainingPens; // total number of pens for distribution

        int penPerPerson = distributedPens / numberOfStudents; // find Pen person
        System.out.println("The Pen Per Student is " + penPerPerson + " and the remaining pen not distributed is "
                + remainingPens);

    }
    public static void main(String[] args) {
        PensDistributor.calculatePens();
        
    }
}
