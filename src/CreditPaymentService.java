import java.util.regex.Matcher;

public class CreditPaymentService {

    public int calculate(float percent, int month, int credit) {
        double _yeadstat = percent / 12 / 100;
        double k = _yeadstat * Math.pow((1 + _yeadstat), month) / (Math.pow((1 + _yeadstat), month) - 1);
        return (int) (k * credit);
    }


}
