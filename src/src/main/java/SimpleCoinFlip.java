import java.util.Random;

public class SimpleCoinFlip {
    public static void main(String[] args){
        Random randomNumbersGenerator = new Random();

        int number = randomNumbersGenerator.nextInt(2);

        if (number == 0){
            System.out.println("HEADS!");
        }else{
            System.out.println("TAILS!");

        }
    }
}
