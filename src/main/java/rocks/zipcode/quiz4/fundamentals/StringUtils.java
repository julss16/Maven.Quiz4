package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char[] characters= string.toCharArray();

        return characters[(characters.length)/2];
    }

    public static String capitalizeMiddleCharacter(String str) {

        char[] characters= str.toCharArray();

        characters[(characters.length)/2]= Character.toUpperCase(characters[(characters.length)/2]);
        String string= new String(characters);

        return string;
    }

    public static String lowerCaseMiddleCharacter(String str) {

        char[] characters= str.toCharArray();

        characters[(characters.length)/2]= Character.toLowerCase(characters[(characters.length)/2]);
        String string= new String(characters);

        return string;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {


        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}