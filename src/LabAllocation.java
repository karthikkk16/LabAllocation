import java.util.Scanner;

public class LabAllocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        if (n <= x) {
            System.out.println("L1");
        }
        else if (n <= y) {
            System.out.println("L2");
        }
        else if (n <= z) {
            System.out.println("L3");
        }

    }
}