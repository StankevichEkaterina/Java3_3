public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double CreditPaymentServiceOne = service.calculate(9.99, 1_000_000, 12);
        System.out.println("Ежемесячный платеж " + CreditPaymentServiceOne);

        double CreditPaymentServiceTwo = service.calculate(9.99, 1_000_000, 24);
        System.out.println("Ежемесячный платеж " + CreditPaymentServiceTwo);

        double CreditPaymentServiceThree = service.calculate(9.99, 1_000_000, 36);
        System.out.println("Ежемесячный платеж " + CreditPaymentServiceThree);

    }
}
