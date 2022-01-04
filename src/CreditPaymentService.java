import java.util.regex.Matcher;

public class CreditPaymentService {

    public int calculate(float percent, int month, int credit) {
        double yeadstat = percent / 12 / 100;
        double k = yeadstat * Math.pow((1 + yeadstat), month) / (Math.pow((1 + yeadstat), month) - 1);
        return (int) (k * credit);
    }


}
