import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDesks = 0;

        while (scanner.hasNext()) {
            int numberOfStudents = scanner.nextInt();
            numberOfDesks += numberOfStudents / 2 + numberOfStudents % 2;
        }

        System.out.println(numberOfDesks);
    }
}