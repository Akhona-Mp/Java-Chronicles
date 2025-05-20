public class SpeedConverter {
    // write code here

    public static void printConversation(double kilometersPerHour) {

        if (kilometersPerHour == -1) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }
}




