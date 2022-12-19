package ood.Utils;
/**
 * the class for deal with the output, giving colorful output.
 * */
public class ColorfulOutput {

    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE


    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    public String redBG(String sentence){return RED_BACKGROUND + sentence + RESET;}

    public String yellowBG(String sentence){return YELLOW_BACKGROUND + sentence + RESET;}

    public String purpleBG(String sentence){return PURPLE_BACKGROUND + sentence + RESET;}


    public void blueOut(String sentence){
        System.out.println(BLUE + sentence + RESET);
    }

    public void redOut(String sentence){
        System.out.println(RED + sentence + RESET);
    }

    public void purpleOut(String sentence){
        System.out.println(PURPLE + sentence + RESET);
    }

    public void yellowOut(String sentence){
        System.out.println(YELLOW + sentence + RESET);
    }

    public void cyanOut(String sentence){
        System.out.println(CYAN + sentence + RESET);
    }
}
