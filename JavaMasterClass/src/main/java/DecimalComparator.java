public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1,3.1));

    }
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber){

        //Checks up to 3 decimal points.
        long newFirst = (long)(firstNumber * 1000.0);
        long newSecond = (long)(secondNumber * 1000.0);

        if(newFirst==newSecond){
            return true;
        }
        return false;
    }

}
