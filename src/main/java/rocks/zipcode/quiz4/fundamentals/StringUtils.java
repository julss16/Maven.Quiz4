package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

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
        String[] strings= str.split("");

        Set<String> set= new HashSet<String>(Arrays.asList(strings));

                if (str.length()==set.size()) {
                    return true;
                } else {
                    return false;

                }
        }


    public static Boolean hasDuplicateConsecutiveCharacters (String str){

        char[] chars = str.toCharArray();
                    for ( int i = 1; i < chars.length; i++ ) {
                        if (chars[i] == chars[i - 1] || chars[i] == chars[i + 1]) {
                            return true;
                        } else {
                            return false;
                        }
                    }return null;

                }



    public static String removeConsecutiveDuplicateCharacters(String str) {
        for(int i=0; i< str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                str= str.substring(0, i) + str.substring(i+2);
            }
        } return str;
    }


    public static String invertCasing(String str) {
        char[] chars= str.toCharArray();

        for (int i=0; i < chars.length; i++){
            char c= chars[i];
            if(Character.isLowerCase(c)){
               chars[i]= Character.toUpperCase(c);
            }else {
                chars[i]= Character.toLowerCase(c);
            }
        }
            String string= new String(chars);

        return string;
    }
}