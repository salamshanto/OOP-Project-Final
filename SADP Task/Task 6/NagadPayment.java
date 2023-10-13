public class NagadPayment implements PaymentStrategy {
    private String PhoneNumber;

    public NagadPayment(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public void payment(float amount) {
        System.out.println("Paid " + amount + " by using Nagad.");
        // Add code to process the payment using Nagad.
    }
}