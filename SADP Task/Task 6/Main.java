public class Main {
    public static void main(String[] args) {
        // Create the context
        SemesterFee cart = new SemesterFee();

        // Choose the payment strategy
        PaymentStrategy Semester = new Semester("213-134-005", "SWE", "Summer");
        PaymentStrategy NagadPayment = new NagadPayment("017*******");

        cart.setPaymentStrategy(Semester);
        cart.checkout(100);

        cart.setPaymentStrategy(NagadPayment);
        cart.checkout(50);
    }
}