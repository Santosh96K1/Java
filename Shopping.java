public class Shopping {

    public double calculateGST(double totalAmount) {
        double discount;
        double discountedAmount;
        double gstRate = 0.18; 

        if (totalAmount >= 9000) {
            discount = 0.10; 
        } else {
            discount = 0.05; 
        }

        discountedAmount = totalAmount - (totalAmount * discount);

        double gst = discountedAmount * gstRate;

        return gst;
    }

    
}
