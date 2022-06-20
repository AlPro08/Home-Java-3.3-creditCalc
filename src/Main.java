public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // где s - сумма кредита;
        // где t - срок кредита;
        // где p - процентная ставка по кредиту

        System.out.println("при кредите на один год ежемесячный платеж = " + service.calculate(1000_000, 1, 9.99));
        System.out.println();
        System.out.println("при кредите на два года ежемесячный платеж = " + service.calculate(1000_000, 2, 9.99));
        System.out.println();
        System.out.println("при кредите на три года ежемесячный платеж = " + service.calculate(1000_000, 3, 9.99));

    }
}
