package lumilumi;

import java.util.Scanner;

public class Custom {
    private static final Scanner scanner = new Scanner(System.in);

    public static int collectInput() throws CohortElevenException {
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        if (userInput < 0) {
            throw new CohortElevenException("Can not take a negative integer!!!!!!!!");
        }
        return 0;
    }

    public static void main(String[] args) {
        try {
            collectInput();
        } catch (CohortElevenException cE) {
            System.out.println( cE.getMessage());;
        }

    }

}

