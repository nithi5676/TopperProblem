package topperProblem;

import java.util.Scanner;

class TopperProblem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int registerNumber = scanner.nextInt();
        scanner.close();
        int temporary;
        int evenSum = 0, oddSum = 0;
        while (registerNumber > 0) {
            temporary = registerNumber % 10;
            if (temporary % 2 == 0) {
                evenSum += temporary;
            } else {
                oddSum += temporary;
            }
            registerNumber /= 10;
        }
        if (evenSum == oddSum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
