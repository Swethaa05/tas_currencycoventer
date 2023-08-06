 import java.util.Scanner;

    public class currencyconverter {

        public static void main(String[] args) {
            // Exchange rates (you can update these as needed)
            double usdToEurRate = 0.85;
            double usdToGbpRate = 0.72;
            double usdToJpyRate = 110.0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Currency Converter");
            System.out.println("===================");

            System.out.print("Enter the amount in USD: ");
            double amountUSD = scanner.nextDouble();

            System.out.println("Select the currency to convert to:");
            System.out.println("1. Euro (EUR)");
            System.out.println("2. British Pound (GBP)");
            System.out.println("3. Japanese Yen (JPY)");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = scanner.nextInt();

            double convertedAmount = 0.0;

            switch (choice) {
                case 1:
                    convertedAmount = amountUSD * usdToEurRate;
                    System.out.println("Converted amount in Euro (EUR): " + convertedAmount);
                    break;
                case 2:
                    convertedAmount = amountUSD * usdToGbpRate;
                    System.out.println("Converted amount in British Pound (GBP): " + convertedAmount);
                    break;
                case 3:
                    convertedAmount = amountUSD * usdToJpyRate;
                    System.out.println("Converted amount in Japanese Yen (JPY): " + convertedAmount);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }

            scanner.close();
        }
    }


