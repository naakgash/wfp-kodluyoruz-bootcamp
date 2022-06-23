package dev.patika.basicconcepts;

public class E_SwitchTest {
    public static void main(String[] args) {
        int dayOfWeek = 1;
        String preText = "Today is ";

        switch (dayOfWeek) {
            case 1 -> System.out.println(preText + " Monday!");
            case 2 -> System.out.println(preText + " Tuesday!");
            case 3 -> System.out.println(preText + " Wednesday!");
            case 4 -> System.out.println(preText + " Thursday!");
            case 5 -> System.out.println(preText + " Friday!");
            case 6 -> System.out.println(preText + " Saturday!");
            case 7 -> System.out.println(preText + " Sunday!");
        }
    }
    public String exampleOfSwitch(String animal) {
        String result;
        final String dog = "DOG"; // Line 23

        switch (animal) {
            case dog: // Constant expression required such as 'final'.
            case "CAT":
                result = "domestic animal";
                break;
            case "TIGER":
                result = "wild animal";
                break;
            default:
                result = "unknown animal";
                break;
        }
        return result;
    }
}

