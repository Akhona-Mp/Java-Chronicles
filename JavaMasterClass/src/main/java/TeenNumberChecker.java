import java.util.logging.StreamHandler;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(13,1,19));
        System.out.println(isTeen(11));
    }

    public static boolean hasTeen(int firstAge,int secondAge,int thirdAge){
        return isTeen(firstAge)||isTeen(secondAge)||isTeen(thirdAge);
    }

    public static boolean isTeen(int age){
        return (age >=13 && age<=19);
    }
}
