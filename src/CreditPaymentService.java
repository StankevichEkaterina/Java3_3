public class CreditPaymentService {
    public double calculate(double loanInterest, int creditAmount, int creditTerm) {
        double monthlyInterestRate = loanInterest / 100 / 12;
        double monthlyPayment = creditAmount * (monthlyInterestRate + (monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, creditTerm) - 1)));
        return monthlyPayment;

    }
}
