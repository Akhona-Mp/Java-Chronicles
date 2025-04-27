import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Bitcoin {
    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("Missing command-line argument.");
            System.exit(1);
        }

        double quantity = getQuantity(args[0]);
        if (quantity == -1) return;

        double pricePerBitcoin = getBitcoinPrice();
        if (pricePerBitcoin == -1) return;

        public static double getQuantity(String inpit){
            try {
                return Double.parseDouble(input); // Convert input string to double
            } catch (NumberFormatException e) {
                System.out.println("Command-line argument is not a valid number.");
                return -1; // Return -1 if invalid input
            }

        }

        public static double getBitcoinPrice() {
            try {
                String apiUrl = "https://rest.coincap.io/v3/assets/bitcoin";
                HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                if (responseCode != HttpURLConnection.HTTP_OK) {
                    System.out.println("Error: Received HTTP response code " + responseCode);
                    return -1; // Exit if HTTP request failed
                }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;

            while ((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(response.toString());
            JSONObject data = json.getJSONObject("data");
            double pricePerBitcoin = Double.parseDouble(data.getString("priceUsd"));
            double totalValue = pricePerBitcoin * quantity;

            System.out.printf("The current price of Bitcoin is: $%,.4f%n", pricePerBitcoin);
            System.out.printf("> %.4f Bitcoin is worth: $%,.4f%n", quantity, totalValue);
        }catch (Exception e) {
            System.out.println("Error retrieving or parsing data: " + e.getMessage());
            System.exit(1);
        }
    }
}
