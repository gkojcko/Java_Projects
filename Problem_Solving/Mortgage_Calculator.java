import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_calculator {
    public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Principal : ");
        int principal = scan1.nextInt();
        System.out.print("Annual Interest rate: ");
        float annual = scan1.nextFloat();
        System.out.print("Period (Years) ");
        int years = scan1.nextInt();
        //MONTHLY PAYMENTS
        int NUMBEROFPAYMENTS = years * MONTHS_IN_YEAR;

        //Declaring r(Monthly Interest rate)
        int NUMBEROFMONTHS = 12;
        float r = annual / PERCENT /  NUMBEROFMONTHS;

        double mortgage;
        double power1 = Math.pow((1+r),NUMBEROFPAYMENTS);
        double power2 = Math.pow((1+r),NUMBEROFPAYMENTS);
        mortgage =principal*(r*(power1))/((power2)-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage would be: " + mortgageFormatted);



    }
}
