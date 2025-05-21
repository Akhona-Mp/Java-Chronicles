public class Color {

    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        System.out.println(RED + "This text is red!" + RESET);
        System.out.println(GREEN + "This text is green!" + RESET);
        System.out.println(YELLOW + "This text is yellow!" + RESET);
        System.out.println(BLUE + "This text is blue!" + RESET);
    }

}
