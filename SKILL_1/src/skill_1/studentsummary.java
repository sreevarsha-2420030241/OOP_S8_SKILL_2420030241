package skill_1;

public class studentsummary {
	public static void main(String[] args) {
        long rollNumber = 2301456789L;
        String name = "Ananya Sharma";
        float marks = 86.5f;
        char gender = 'F';
        boolean isPassed = true;

        System.out.println("------ Student Summary ------");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        System.out.println("Gender      : " + gender);
        System.out.println("Pass Status : " + (isPassed ? "Passed" : "Failed"));
    }
}
