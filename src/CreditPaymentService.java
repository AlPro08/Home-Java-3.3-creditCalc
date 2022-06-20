public class CreditPaymentService {

    public double calculate(int s, int t, double p) {
        double i = p / 1200; // процентная ставка в пересчете на месяц
        int n = t * 12; // количество выплат за период кредита (степень возведения)
        double a = 1 + i; // возводим в степень
        double b = Math.pow(a, n); // (1 + i) ^ n
        double k = (i * b) / (b - 1); // коэф. иннуитета
        int payment = (int) (s * k); // ежемесячный платеж
        return payment;
    }

}
