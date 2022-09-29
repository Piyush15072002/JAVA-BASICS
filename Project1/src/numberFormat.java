import java.text.NumberFormat;
import java.util.Locale;

public class numberFormat {
    public static void main(String[] args) throws Exception {

        // Number formatting comes in handy when we wanna have different formats like
        // currency, dates and various other formats

        // import NumberFormat from java.text
        // however the NumberFormat is an "ABSTRACT" class

        // we will see later what it is but for abstract classes we don't have to
        // instantiate the memory

        // I was getting an error, that is why i searched and found that we need this
        // library to tell which format of currency we want
        // locale is a library that tells the NumberFormat, the type of currency
        // instance we want

        NumberFormat myMoney = NumberFormat.getCurrencyInstance(Locale.US);

        // now we have created a myMoney instance for currency format and so we can use
        // the package that comes with it

        // format method returns a string and so the datatype should be string
        String num = myMoney.format(10);

        System.out.println(num);

    }
}
