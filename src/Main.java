public class Main {

    public static final Integer[] input = new Integer[]{
            1247483647,
            1000000000,
            2000000000,
            999999999
    };

    public static void main(String[] args) {

        for(int i = 0; i < input.length; i++){

            int inputNum = input[i];
            String numberInWords = NumberToWords.numberToWords(inputNum);
            System.out.println(inputNum + " : " + numberInWords);
            System.out.println("-----------------------------------------");

//            int inputNum = input[i];
//            String numberInWords = "";
//
//
//            // Billions
//            int numberOfBillions = inputNum / (int) Math.pow(10, 9);
//            if(numberOfBillions > 0){
//                numberInWords += NumberToWords.unitHundredTensOnes(numberOfBillions, 9);
//            }
//
//
//            // Millions
//            int onlyMillions = inputNum - (numberOfBillions * (int) Math.pow(10, 9));
//            int numberOfMillions = onlyMillions / (int) Math.pow(10, 6);
//            if(numberOfMillions > 0){
//                numberInWords += NumberToWords.unitHundredTensOnes(numberOfMillions, 6) ;
//            }
//
//
//            // Thousands
//            int onlyThousands = onlyMillions - (numberOfMillions * (int) Math.pow(10, 6));
//            int numberOfThousands = onlyThousands / (int) Math.pow(10, 3);
//            if(numberOfThousands > 0){
//                numberInWords += NumberToWords.unitHundredTensOnes(numberOfThousands, 3);
//            }
//
//
//            // HundredsTensAndUnits
//            int onlyHundreds = onlyThousands - (numberOfThousands * (int) Math.pow(10, 3));
//            int numberOfTensAndUnits = onlyHundreds / (int) Math.pow(10, 0);
//            if(onlyHundreds > 0){
//                numberInWords += NumberToWords.unitHundredTensOnes(numberOfTensAndUnits, 0);
//            }
//
//
//            System.out.println(inputNum + " : " + numberInWords);
//            System.out.println("-----------------------------------------");

        }


    }
}
