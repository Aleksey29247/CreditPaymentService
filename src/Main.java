public class Main {
    public static void main (String [] args) {
        CreditPaymentService cCredit = new CreditPaymentService();
        float percent = (float)9.99;
        int month=12;
        int credit=1_000_000;

        System.out.printf("Ежемесячный платеж %d рублей\n",cCredit.calculate(percent, month, credit));
        month=24;
        System.out.printf("Ежемесячный платеж %d рублей\n",cCredit.calculate(percent, month, credit));
        month=36;
        System.out.printf("Ежемесячный платеж %d рублей\n ",cCredit.calculate(percent, month, credit));


    }
}
