public class Param {

    public static void pars(int year, double mortageRate, double exchangeRate, boolean isSunday, String country){
        System.out.println("Year that went well: " + year);
        System.out.println("Fixed 15 year Mortgage Rate: " + mortageRate);
        System.out.println("KRW to USD: " + exchangeRate);
        System.out.println("Today is Sunday: " + isSunday);
        System.out.println("Country I want to visit: " + country);

    }

    public static void main(String[] args){

        System.out.println("java Param");
        int year = 2018;
        double mortageRate = 6.8;
        double exchangeRate = 1329.39;
        boolean isSunday = false;
        String country = "Taiwan";

        pars(year, mortageRate, exchangeRate, isSunday, country);

    }


}
