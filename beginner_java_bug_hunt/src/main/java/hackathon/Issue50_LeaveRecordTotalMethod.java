public class Issue50_LeaveRecordTotalMethod {
    public static void main(String[] args) {
        int unitFee = 60;
        int quantity = 7;
        int discountPercent = 30;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
