import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {

        double kilograms, pounds;

        System.out.println("\n\n\n=================Welcome to THEE Deciders' unit Converter===================\n\n\n");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter weight in pounds: ");
            String input = sc.nextLine();

            // Use a regular expression to check if the input is a valid double value
            if (input.matches("-?\\d+(\\.\\d+)?")) {
                pounds = Double.parseDouble(input);
                break; // Break the loop if a valid double value is entered
            } else {
                System.out.println("Invalid input. Please enter a valid numerical value.");
            }
        }

        sc.close();

        // Formulas
        kilograms = pounds * 0.453592;

        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
    }
}
