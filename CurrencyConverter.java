import java.util.Scanner;
/**
 * CurrencyConverter
 */
public class CurrencyConverter {

    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Currency Converter");
        System.out.println("Select Base Currency:");
        String baseCurrency=sc.nextLine();
        System.out.println("Select target Currency:");
        String targetCurrency = sc.nextLine();
        System.out.println("Enter Amount to convert:");
        double amount = sc.nextDouble();
        double exchangeRate = getExchangeRate(baseCurrency,targetCurrency);
        double convertedAmount = amount * exchangeRate;
        System.out.println(amount+" "+baseCurrency+"is equal to"+ convertedAmount+" "+targetCurrency);
    }
    static int getExchangeRate(String baseCurrency, String targetCurrency)
    {
        return 1;
    }
}