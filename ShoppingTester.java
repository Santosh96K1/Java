public class ShoppingTester

public static void main(String[] args) {
        Shopping shopping = new Shopping();

        double totalAmount1 = 9000;
        double gst1 = shopping.calculateGST(totalAmount1);
        System.out.println("GST for total amount " + totalAmount1 + " is: " + gst1);

        double totalAmount2 = 8500;
        double gst2 = shopping.calculateGST(totalAmount2);
        System.out.println("GST for total amount " + totalAmount2 + " is: " + gst2);
    }