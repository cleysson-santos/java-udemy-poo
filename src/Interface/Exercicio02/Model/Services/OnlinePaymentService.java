package Interface.Exercicio02.Model.Services;

public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);
}
