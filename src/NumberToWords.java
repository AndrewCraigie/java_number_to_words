public class NumberToWords {

    public static final String[] units = new String[]{
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    public static final String[] tens = new String[]{
            "",
            "",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety"
    };

    public static final String[] largeNumberName = new String[]{
            "",         // Ones     10^0
            "",         // Tens     10^1
            "Hundred",  //          10^2
            "Thousand", //          10^3
            "",         //          10^4    TenThousand
            "",         //          10^5    OneHundredThousand
            "Million",  //          10^6
            "",         //          10^7    TenMillion
            "",         //          10^8    OneHundredMillion
            "Billion"   //          10^9

    };



    public static String unitHundredTensOnes(int number, int powerNumber) {

        String unitString = "";
        String namesString = "";
        String tensOnesString = "";
        String powerString = largeNumberName[powerNumber];

        String result = "";

        int power = 2;
        int unit = (int) (number / (Math.pow(10, power)));

        unitString = units[unit];           // e.g.t Two
        if(unit != 0){
            namesString = largeNumberName[power];     // Hundred
        }


        // -------------------------

        // TensOnes part
        int tensOnes = number % 100;
        int tensPart = (int) (tensOnes / (Math.pow(10, 1)));


        // 1..19
        if ((tensOnes > 0) && (tensOnes < 20)) {
            tensOnesString = units[tensOnes];
            return unitString + namesString + tensOnesString;
        }


        // -------------------------

        // 20...99
        // Get how many tens

        String tensString = tens[tensPart];

        // Get how many Ones
        int onesPart = tensOnes % 10;
        String onesString = units[onesPart];

        return unitString + namesString + tensString + onesString + powerString;

    }



}
