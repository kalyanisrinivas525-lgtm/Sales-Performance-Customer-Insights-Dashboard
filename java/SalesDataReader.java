import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SalesDataReader {

    public static void main(String[] args) {

        String filePath = "data/sales_data.csv";

        int totalOrders = 0;
        int totalQuantity = 0;
        double totalSales = 0;
        double totalProfit = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                totalOrders++;
                totalQuantity += Integer.parseInt(data[7]);
                totalSales += Double.parseDouble(data[6]);
                totalProfit += Double.parseDouble(data[8]);
            }

            br.close();

            double averageOrder = totalSales / totalOrders;

            System.out.println("===== SALES ANALYTICS =====");
            System.out.println("Total Orders   : " + totalOrders);
            System.out.println("Total Quantity : " + totalQuantity);
            System.out.println("Total Sales    : " + totalSales);
            System.out.println("Total Profit   : " + totalProfit);
            System.out.println("Average Order  : " + averageOrder);

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
