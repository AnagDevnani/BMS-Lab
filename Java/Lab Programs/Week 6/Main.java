import cie.Internals;
import see.External;

public class Main {
    public static void main(String[] args) {
        
        int n = 2;  

        int[] internalMarks1 = {20, 30, 25, 28, 22};
        int[] externalMarks1 = {60, 70, 55, 65, 50};
        Internals student1Internal = new Internals("USN123", "Alice", 3, internalMarks1);
        External student1External = new External("USN123", "Alice", 3, externalMarks1);

        int[] internalMarks2 = {18, 25, 20, 23, 28};
        int[] externalMarks2 = {50, 65, 60, 58, 45};
        Internals student2Internal = new Internals("USN124", "Bob", 3, internalMarks2);
        External student2External = new External("USN124", "Bob", 3, externalMarks2);

        System.out.println("Student 1 Info: ");
        student1Internal.displayStudentInfo();
        student1Internal.displayInternalMarks();
        student1External.displayExternalMarks();

        int[] finalMarks1 = calculateFinalMarks(student1Internal.internalMarks, student1External.externalMarks);
        displayFinalMarks(finalMarks1);

        System.out.println("\nStudent 2 Info: ");
        student2Internal.displayStudentInfo();
        student2Internal.displayInternalMarks();
        student2External.displayExternalMarks();

        int[] finalMarks2 = calculateFinalMarks(student2Internal.internalMarks, student2External.externalMarks);
        displayFinalMarks(finalMarks2);
    }

    public static int[] calculateFinalMarks(int[] internalMarks, int[] externalMarks) {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + externalMarks[i];
        }
        return finalMarks;
    }


    public static void displayFinalMarks(int[] finalMarks) {
        System.out.println("Final Marks (Internal + External): ");
        for (int mark : finalMarks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}

