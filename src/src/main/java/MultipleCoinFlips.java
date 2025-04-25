import java.util.Random;

public class MultipleCoinFlips {
    public static void main(String[] args){
        int flips = 1;

        if (args.length == 1){
            try {
                flips = Integer.parseInt(args[0]);
            } catch (NumberFormatException e){
                System.out.println("Specify" + "the number of flips to simulate");
                return;
            }

        }
        Random randomNum = new Random();

        for (int i = 0; i < flips; i++){
            if (randomNum.nextInt(2) == 0){
                System.out.println("HEADS!");
            } else {
                System.out.println("TAILS!");
            }
        }
    }
}
