public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        int megabytes = Math.round(kiloBytes/1024);
        double remainingkilobytes = Math.round(kiloBytes%megabytes);

        System.out.println(kiloBytes + "KB = " + megabytes+ "MB"+remainingkilobytes+"KB");
    }
}
