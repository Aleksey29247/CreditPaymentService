import java.util.regex.Matcher;

public class CreditPaymentService {
    private double _yeadstat;
    private double k;
    public CreditPaymentService(){
        _yeadstat=0;
        k=0;
    }
    public int calculate(float percent,int month, int credit)
    {
        _yeadstat=percent/12/100;
        k=_yeadstat* Math.pow((1+_yeadstat),month)/(Math.pow((1+_yeadstat),month)-1);
        return (int)(k*credit);
    }


}
