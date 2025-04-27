import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Bitcoin {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Missing command-line argument.");
            System.exit(1);
        }

        double quantity = getQuantity(args[0]);
        if (quantity == -1) return; // Exit if invalid quantity

        double pricePerBitcoin = getBitcoinPrice();
        if (pricePerBitcoin == -1) return; // Exit if unable to get price

        double totalValue = calculateTotalValue(pricePerBitcoin, quantity);

        printResults(pricePerBitcoin, quantity, totalValue); // Output results
    }

    // Method to get the quantity from command-line argument
    public static double getQuantity(String input) {
        try {
            // Convert input string to double
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Command-line argument is not a valid number.");
            return -1;
        }
    }

    // Method to fetch the current price of Bitcoin from the API
    public static double getBitcoinPrice() {
        try {
            String apiUrl = "https://rest.coincap.io/v3/assets/bitcoin";
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.out.println("Error: Received HTTP response code " + responseCode);
                return -1;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(response.toString());
            JSONObject data = json.getJSONObject("data");
            return Double.parseDouble(data.getString("priceUsd")); // Extract Bitcoin price in USD
        } catch (Exception e) {
            System.out.println("Error retrieving or parsing data: " + e.getMessage());
            return -1;
        }
    }

    // Method to calculate total value of Bitcoin
    public static double calculateTotalValue(double pricePerBitcoin, double quantity) {
        return pricePerBitcoin * quantity;
    }

    // Method to print results to the console
    public static void printResults(double pricePerBitcoin, double quantity, double totalValue) {
        System.out.printf("The current price of Bitcoin is: $%,.4f%n", pricePerBitcoin);
        System.out.printf("> %.4f Bitcoin is worth: $%,.4f%n", quantity, totalValue);
    }
}
